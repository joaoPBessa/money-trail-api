package com.moneytrail.api.distributionmethod;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.moneytrail.api.distributionmethod.exception.DistributionMethodNotFoundException;
import com.moneytrail.api.distributionmethod.exception.DuplicateDistributionMethodTitleException;
import com.moneytrail.api.distributionmethod.exception.InvalidDistributionMethodException;

@ExtendWith(MockitoExtension.class)
class DistributionMethodServiceTest {

    @Mock
    private DistributionMethodRepository repository;

    private DistributionMethodService service;

    @BeforeEach
    void setUp() {
        service = new DistributionMethodServiceImpl(repository);
    }

    @Test
    void create_savesAndReturnsMethod_whenValidAndTitleUnique() {
        when(repository.existsByTitleIgnoreCase("90/10")).thenReturn(false);

        DistributionMethod result = service.create("90/10", 90, 10);

        ArgumentCaptor<DistributionMethod> captor = ArgumentCaptor.forClass(DistributionMethod.class);
        verify(repository).save(captor.capture());
        assertThat(captor.getValue().getTitle()).isEqualTo("90/10");
        assertThat(captor.getValue().getSpendPercentage()).isEqualTo(90);
        assertThat(captor.getValue().getInvestmentPercentage()).isEqualTo(10);
        assertThat(result).isSameAs(captor.getValue());
    }

    @Test
    void create_throwsInvalid_whenPercentagesDoNotSumTo100() {
        assertThrows(InvalidDistributionMethodException.class, () -> service.create("70/20", 70, 20));

        verifyNoInteractions(repository);
    }

    @Test
    void create_throwsDuplicate_whenTitleExistsCaseInsensitive() {
        when(repository.existsByTitleIgnoreCase("90/10")).thenReturn(true);

        assertThrows(DuplicateDistributionMethodTitleException.class, () -> service.create("90/10", 90, 10));

        verify(repository).existsByTitleIgnoreCase("90/10");
        verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll_returnsAllOrderedByCreatedAtAscending() {
        DistributionMethod first = new DistributionMethod("90/10", 90, 10);
        DistributionMethod second = new DistributionMethod("80/20", 80, 20);
        when(repository.findAllByOrderByCreatedAtAsc()).thenReturn(List.of(first, second));

        List<DistributionMethod> result = service.findAll();

        assertThat(result).containsExactly(first, second);
    }

    @Test
    void findById_returnsMethod_whenExists() {
        UUID id = UUID.randomUUID();
        DistributionMethod method = new DistributionMethod("90/10", 90, 10);
        when(repository.findById(id)).thenReturn(Optional.of(method));

        DistributionMethod result = service.findById(id);

        assertThat(result).isSameAs(method);
    }

    @Test
    void findById_throwsNotFound_whenIdMissing() {
        UUID id = UUID.randomUUID();
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(DistributionMethodNotFoundException.class, () -> service.findById(id));
    }

    @Test
    void update_savesChangesAndReturnsMethod_whenExistsAndValid() {
        UUID id = UUID.randomUUID();
        DistributionMethod existing = new DistributionMethod("Old", 80, 20);
        when(repository.findById(id)).thenReturn(Optional.of(existing));
        when(repository.existsByTitleIgnoreCaseAndIdNot("New", id)).thenReturn(false);

        DistributionMethod result = service.update(id, "New", 70, 30);

        assertThat(result).isSameAs(existing);
        assertThat(result.getTitle()).isEqualTo("New");
        assertThat(result.getSpendPercentage()).isEqualTo(70);
        assertThat(result.getInvestmentPercentage()).isEqualTo(30);
        verify(repository).save(existing);
    }

    @Test
    void update_throwsNotFound_whenIdMissing() {
        UUID id = UUID.randomUUID();
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(DistributionMethodNotFoundException.class, () -> service.update(id, "T", 50, 50));

        verify(repository).findById(id);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void update_throwsDuplicate_whenTitleUsedByDifferentMethod() {
        UUID id = UUID.randomUUID();
        DistributionMethod existing = new DistributionMethod("Old", 80, 20);
        when(repository.findById(id)).thenReturn(Optional.of(existing));
        when(repository.existsByTitleIgnoreCaseAndIdNot("Dup", id)).thenReturn(true);

        assertThrows(DuplicateDistributionMethodTitleException.class,
                () -> service.update(id, "Dup", 70, 30));

        verify(repository).findById(id);
        verify(repository).existsByTitleIgnoreCaseAndIdNot("Dup", id);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void update_allowsSameMethodKeepingItsOwnTitle() {
        UUID id = UUID.randomUUID();
        DistributionMethod existing = new DistributionMethod("Same", 80, 20);
        when(repository.findById(id)).thenReturn(Optional.of(existing));
        when(repository.existsByTitleIgnoreCaseAndIdNot("Same", id)).thenReturn(false);

        DistributionMethod result = service.update(id, "Same", 60, 40);

        assertThat(result.getTitle()).isEqualTo("Same");
        assertThat(result.getSpendPercentage()).isEqualTo(60);
        assertThat(result.getInvestmentPercentage()).isEqualTo(40);
        verify(repository).save(existing);
    }

    @Test
    void update_throwsInvalid_whenPercentagesDoNotSumTo100() {
        UUID id = UUID.randomUUID();
        DistributionMethod existing = new DistributionMethod("T", 80, 20);
        when(repository.findById(id)).thenReturn(Optional.of(existing));

        assertThrows(InvalidDistributionMethodException.class, () -> service.update(id, "T", 70, 20));

        verify(repository).findById(id);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void delete_removesMethod_whenExists() {
        UUID id = UUID.randomUUID();
        when(repository.existsById(id)).thenReturn(true);

        service.delete(id);

        verify(repository).deleteById(id);
    }

    @Test
    void delete_throwsNotFound_whenIdMissing() {
        UUID id = UUID.randomUUID();
        when(repository.existsById(id)).thenReturn(false);

        assertThrows(DistributionMethodNotFoundException.class, () -> service.delete(id));

        verify(repository).existsById(id);
        verifyNoMoreInteractions(repository);
    }
}

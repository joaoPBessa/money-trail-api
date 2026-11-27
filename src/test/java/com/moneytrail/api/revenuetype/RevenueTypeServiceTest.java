package com.moneytrail.api.revenuetype;

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

import com.moneytrail.api.revenuetype.exception.DuplicateRevenueTypeNameException;
import com.moneytrail.api.revenuetype.exception.RevenueTypeNotFoundException;

@ExtendWith(MockitoExtension.class)
class RevenueTypeServiceTest {

    @Mock
    private RevenueTypeRepository repository;

    private RevenueTypeService service;

    @BeforeEach
    void setUp() {
        service = new RevenueTypeServiceImpl(repository);
    }

    @Test
    void create_savesAndReturnsType_whenValidAndNameUnique() {
        when(repository.existsByNameIgnoreCase("Prêmio")).thenReturn(false);

        RevenueType result = service.create("Prêmio");

        ArgumentCaptor<RevenueType> captor = ArgumentCaptor.forClass(RevenueType.class);
        verify(repository).save(captor.capture());
        assertThat(captor.getValue().getName()).isEqualTo("Prêmio");
        assertThat(result).isSameAs(captor.getValue());
    }

    @Test
    void create_throwsDuplicate_whenNameExistsCaseInsensitive() {
        when(repository.existsByNameIgnoreCase("Prêmio")).thenReturn(true);

        assertThrows(DuplicateRevenueTypeNameException.class, () -> service.create("Prêmio"));

        verify(repository).existsByNameIgnoreCase("Prêmio");
        verifyNoMoreInteractions(repository);
    }

    @Test
    void create_throwsDuplicate_whenNameDiffersOnlyByWhitespace() {
        when(repository.existsByNameIgnoreCase("Prêmio")).thenReturn(true);

        assertThrows(DuplicateRevenueTypeNameException.class, () -> service.create("  Prêmio  "));

        verify(repository).existsByNameIgnoreCase("Prêmio");
        verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll_returnsAllOrderedByCreatedAtAscending() {
        RevenueType first = new RevenueType("Saldo Disponível");
        RevenueType second = new RevenueType("Salário Próprio");
        when(repository.findAllByOrderByCreatedAtAsc()).thenReturn(List.of(first, second));

        List<RevenueType> result = service.findAll();

        assertThat(result).containsExactly(first, second);
    }

    @Test
    void findById_returnsType_whenExists() {
        UUID id = UUID.randomUUID();
        RevenueType revenueType = new RevenueType("Estorno");
        when(repository.findById(id)).thenReturn(Optional.of(revenueType));

        RevenueType result = service.findById(id);

        assertThat(result).isSameAs(revenueType);
    }

    @Test
    void findById_throwsNotFound_whenIdMissing() {
        UUID id = UUID.randomUUID();
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(RevenueTypeNotFoundException.class, () -> service.findById(id));
    }

    @Test
    void update_savesChangesAndReturnsType_whenExistsAndValid() {
        UUID id = UUID.randomUUID();
        RevenueType existing = new RevenueType("Old");
        when(repository.findById(id)).thenReturn(Optional.of(existing));
        when(repository.existsByNameIgnoreCaseAndIdNot("New", id)).thenReturn(false);

        RevenueType result = service.update(id, "New");

        assertThat(result).isSameAs(existing);
        assertThat(result.getName()).isEqualTo("New");
        verify(repository).save(existing);
    }

    @Test
    void update_throwsNotFound_whenIdMissing() {
        UUID id = UUID.randomUUID();
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(RevenueTypeNotFoundException.class, () -> service.update(id, "T"));

        verify(repository).findById(id);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void update_throwsDuplicate_whenNameUsedByDifferentType() {
        UUID id = UUID.randomUUID();
        RevenueType existing = new RevenueType("Old");
        when(repository.findById(id)).thenReturn(Optional.of(existing));
        when(repository.existsByNameIgnoreCaseAndIdNot("Dup", id)).thenReturn(true);

        assertThrows(DuplicateRevenueTypeNameException.class, () -> service.update(id, "Dup"));

        verify(repository).findById(id);
        verify(repository).existsByNameIgnoreCaseAndIdNot("Dup", id);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void update_allowsSameTypeKeepingItsOwnName() {
        UUID id = UUID.randomUUID();
        RevenueType existing = new RevenueType("Same");
        when(repository.findById(id)).thenReturn(Optional.of(existing));
        when(repository.existsByNameIgnoreCaseAndIdNot("Same", id)).thenReturn(false);

        RevenueType result = service.update(id, "Same");

        assertThat(result.getName()).isEqualTo("Same");
        verify(repository).save(existing);
    }

    @Test
    void delete_removesType_whenExists() {
        UUID id = UUID.randomUUID();
        when(repository.existsById(id)).thenReturn(true);

        service.delete(id);

        verify(repository).deleteById(id);
    }

    @Test
    void delete_throwsNotFound_whenIdMissing() {
        UUID id = UUID.randomUUID();
        when(repository.existsById(id)).thenReturn(false);

        assertThrows(RevenueTypeNotFoundException.class, () -> service.delete(id));

        verify(repository).existsById(id);
        verifyNoMoreInteractions(repository);
    }
}

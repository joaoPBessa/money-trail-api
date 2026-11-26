package com.moneytrail.api.distributionmethod;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.moneytrail.api.distributionmethod.exception.DistributionMethodNotFoundException;
import com.moneytrail.api.distributionmethod.exception.DuplicateDistributionMethodTitleException;
import com.moneytrail.api.distributionmethod.exception.InvalidDistributionMethodException;

@Service
public class DistributionMethodServiceImpl implements DistributionMethodService {

    private final DistributionMethodRepository repository;

    public DistributionMethodServiceImpl(DistributionMethodRepository repository) {
        this.repository = repository;
    }

    @Override
    public DistributionMethod create(String title, int spendPercentage, int investmentPercentage) {
        validatePercentages(spendPercentage, investmentPercentage);
        String normalizedTitle = title.trim();
        if (repository.existsByTitleIgnoreCase(normalizedTitle)) {
            throw new DuplicateDistributionMethodTitleException(
                    "A distribution method titled '" + normalizedTitle + "' already exists");
        }
        DistributionMethod method = new DistributionMethod(normalizedTitle, spendPercentage, investmentPercentage);
        repository.save(method);
        return method;
    }

    @Override
    public List<DistributionMethod> findAll() {
        return repository.findAllByOrderByCreatedAtAsc();
    }

    @Override
    public DistributionMethod findById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new DistributionMethodNotFoundException(
                        "No distribution method found with id " + id));
    }

    @Override
    public DistributionMethod update(UUID id, String title, int spendPercentage, int investmentPercentage) {
        DistributionMethod existing = findById(id);
        validatePercentages(spendPercentage, investmentPercentage);
        String normalizedTitle = title.trim();
        if (repository.existsByTitleIgnoreCaseAndIdNot(normalizedTitle, id)) {
            throw new DuplicateDistributionMethodTitleException(
                    "A distribution method titled '" + normalizedTitle + "' already exists");
        }
        existing.setTitle(normalizedTitle);
        existing.setSpendPercentage(spendPercentage);
        existing.setInvestmentPercentage(investmentPercentage);
        repository.save(existing);
        return existing;
    }

    @Override
    public void delete(UUID id) {
        if (!repository.existsById(id)) {
            throw new DistributionMethodNotFoundException("No distribution method found with id " + id);
        }
        repository.deleteById(id);
    }

    private void validatePercentages(int spendPercentage, int investmentPercentage) {
        if (spendPercentage < 0 || spendPercentage > 100 || investmentPercentage < 0 || investmentPercentage > 100) {
            throw new InvalidDistributionMethodException(
                    "spendPercentage and investmentPercentage must each be between 0 and 100");
        }
        if (spendPercentage + investmentPercentage != 100) {
            throw new InvalidDistributionMethodException(
                    "spendPercentage and investmentPercentage must sum to 100");
        }
    }
}

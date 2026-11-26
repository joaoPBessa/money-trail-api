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
        validatePercentageSum(spendPercentage, investmentPercentage);
        if (repository.existsByTitleIgnoreCase(title)) {
            throw new DuplicateDistributionMethodTitleException(
                    "A distribution method titled '" + title + "' already exists");
        }
        DistributionMethod method = new DistributionMethod(title, spendPercentage, investmentPercentage);
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
        validatePercentageSum(spendPercentage, investmentPercentage);
        if (repository.existsByTitleIgnoreCaseAndIdNot(title, id)) {
            throw new DuplicateDistributionMethodTitleException(
                    "A distribution method titled '" + title + "' already exists");
        }
        existing.setTitle(title);
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

    private void validatePercentageSum(int spendPercentage, int investmentPercentage) {
        if (spendPercentage + investmentPercentage != 100) {
            throw new InvalidDistributionMethodException(
                    "spendPercentage and investmentPercentage must sum to 100");
        }
    }
}

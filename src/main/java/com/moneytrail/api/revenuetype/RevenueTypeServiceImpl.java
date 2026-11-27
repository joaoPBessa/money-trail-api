package com.moneytrail.api.revenuetype;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.moneytrail.api.revenuetype.exception.DuplicateRevenueTypeNameException;
import com.moneytrail.api.revenuetype.exception.RevenueTypeNotFoundException;

@Service
public class RevenueTypeServiceImpl implements RevenueTypeService {

    private final RevenueTypeRepository repository;

    public RevenueTypeServiceImpl(RevenueTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public RevenueType create(String name) {
        String normalizedName = name.trim();
        if (repository.existsByNameIgnoreCase(normalizedName)) {
            throw new DuplicateRevenueTypeNameException(
                    "A revenue type named '" + normalizedName + "' already exists");
        }
        RevenueType revenueType = new RevenueType(normalizedName);
        repository.save(revenueType);
        return revenueType;
    }

    @Override
    public List<RevenueType> findAll() {
        return repository.findAllByOrderByCreatedAtAsc();
    }

    @Override
    public RevenueType findById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new RevenueTypeNotFoundException("No revenue type found with id " + id));
    }

    @Override
    public RevenueType update(UUID id, String name) {
        RevenueType existing = findById(id);
        String normalizedName = name.trim();
        if (repository.existsByNameIgnoreCaseAndIdNot(normalizedName, id)) {
            throw new DuplicateRevenueTypeNameException(
                    "A revenue type named '" + normalizedName + "' already exists");
        }
        existing.setName(normalizedName);
        repository.save(existing);
        return existing;
    }

    @Override
    public void delete(UUID id) {
        if (!repository.existsById(id)) {
            throw new RevenueTypeNotFoundException("No revenue type found with id " + id);
        }
        repository.deleteById(id);
    }
}

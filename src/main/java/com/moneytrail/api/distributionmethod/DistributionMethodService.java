package com.moneytrail.api.distributionmethod;

import java.util.List;
import java.util.UUID;

public interface DistributionMethodService {

    DistributionMethod create(String title, int spendPercentage, int investmentPercentage);

    List<DistributionMethod> findAll();

    DistributionMethod findById(UUID id);

    DistributionMethod update(UUID id, String title, int spendPercentage, int investmentPercentage);

    void delete(UUID id);
}

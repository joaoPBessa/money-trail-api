package com.moneytrail.api.distributionmethod.dto;

import java.time.Instant;
import java.util.UUID;

import com.moneytrail.api.distributionmethod.DistributionMethod;

public record DistributionMethodResponse(
        UUID id,
        String title,
        int spendPercentage,
        int investmentPercentage,
        Instant createdAt,
        Instant updatedAt) {

    public static DistributionMethodResponse from(DistributionMethod method) {
        return new DistributionMethodResponse(
                method.getId(),
                method.getTitle(),
                method.getSpendPercentage(),
                method.getInvestmentPercentage(),
                method.getCreatedAt(),
                method.getUpdatedAt());
    }
}

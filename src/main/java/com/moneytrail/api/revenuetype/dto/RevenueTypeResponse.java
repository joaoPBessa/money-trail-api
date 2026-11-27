package com.moneytrail.api.revenuetype.dto;

import java.time.Instant;
import java.util.UUID;

import com.moneytrail.api.revenuetype.RevenueType;

public record RevenueTypeResponse(UUID id, String name, Instant createdAt, Instant updatedAt) {

    public static RevenueTypeResponse from(RevenueType revenueType) {
        return new RevenueTypeResponse(
                revenueType.getId(),
                revenueType.getName(),
                revenueType.getCreatedAt(),
                revenueType.getUpdatedAt());
    }
}

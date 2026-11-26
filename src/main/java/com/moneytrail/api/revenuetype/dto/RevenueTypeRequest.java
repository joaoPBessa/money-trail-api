package com.moneytrail.api.revenuetype.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RevenueTypeRequest(@NotBlank @Size(max = 100) String name) {

    public RevenueTypeRequest {
        name = name == null ? null : name.trim();
    }
}

package com.moneytrail.api.error;

public record ApiError(int status, String message) {
}

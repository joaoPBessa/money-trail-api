package com.moneytrail.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.moneytrail.api.distributionmethod.exception.DistributionMethodNotFoundException;
import com.moneytrail.api.distributionmethod.exception.DuplicateDistributionMethodTitleException;
import com.moneytrail.api.distributionmethod.exception.InvalidDistributionMethodException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DistributionMethodNotFoundException.class)
    public ResponseEntity<ApiError> handleNotFound(DistributionMethodNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND.value(), exception.getMessage()));
    }

    @ExceptionHandler(DuplicateDistributionMethodTitleException.class)
    public ResponseEntity<ApiError> handleDuplicate(DuplicateDistributionMethodTitleException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ApiError(HttpStatus.CONFLICT.value(), exception.getMessage()));
    }

    @ExceptionHandler(InvalidDistributionMethodException.class)
    public ResponseEntity<ApiError> handleInvalid(InvalidDistributionMethodException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ApiError(HttpStatus.BAD_REQUEST.value(), exception.getMessage()));
    }
}

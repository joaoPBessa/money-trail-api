package com.moneytrail.api.distributionmethod;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneytrail.api.distributionmethod.dto.DistributionMethodRequest;
import com.moneytrail.api.distributionmethod.dto.DistributionMethodResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/distribution-methods")
public class DistributionMethodController {

    private final DistributionMethodService service;

    public DistributionMethodController(DistributionMethodService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DistributionMethodResponse> create(@Valid @RequestBody DistributionMethodRequest request) {
        DistributionMethod created = service.create(
                request.title(), request.spendPercentage(), request.investmentPercentage());
        return ResponseEntity.created(URI.create("/api/distribution-methods/" + created.getId()))
                .body(DistributionMethodResponse.from(created));
    }

    @GetMapping
    public List<DistributionMethodResponse> list() {
        return service.findAll().stream().map(DistributionMethodResponse::from).toList();
    }

    @GetMapping("/{id}")
    public DistributionMethodResponse getById(@PathVariable UUID id) {
        return DistributionMethodResponse.from(service.findById(id));
    }

    @PutMapping("/{id}")
    public DistributionMethodResponse update(
            @PathVariable UUID id, @Valid @RequestBody DistributionMethodRequest request) {
        DistributionMethod updated = service.update(
                id, request.title(), request.spendPercentage(), request.investmentPercentage());
        return DistributionMethodResponse.from(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

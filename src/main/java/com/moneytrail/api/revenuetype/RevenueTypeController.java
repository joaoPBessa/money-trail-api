package com.moneytrail.api.revenuetype;

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

import com.moneytrail.api.revenuetype.dto.RevenueTypeRequest;
import com.moneytrail.api.revenuetype.dto.RevenueTypeResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/revenue-types")
public class RevenueTypeController {

    private final RevenueTypeService service;

    public RevenueTypeController(RevenueTypeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RevenueTypeResponse> create(@Valid @RequestBody RevenueTypeRequest request) {
        RevenueType created = service.create(request.name());
        return ResponseEntity.created(URI.create("/api/revenue-types/" + created.getId()))
                .body(RevenueTypeResponse.from(created));
    }

    @GetMapping
    public List<RevenueTypeResponse> list() {
        return service.findAll().stream().map(RevenueTypeResponse::from).toList();
    }

    @GetMapping("/{id}")
    public RevenueTypeResponse getById(@PathVariable UUID id) {
        return RevenueTypeResponse.from(service.findById(id));
    }

    @PutMapping("/{id}")
    public RevenueTypeResponse update(@PathVariable UUID id, @Valid @RequestBody RevenueTypeRequest request) {
        RevenueType updated = service.update(id, request.name());
        return RevenueTypeResponse.from(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

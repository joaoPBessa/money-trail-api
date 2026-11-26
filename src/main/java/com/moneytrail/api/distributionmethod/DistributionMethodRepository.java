package com.moneytrail.api.distributionmethod;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributionMethodRepository extends JpaRepository<DistributionMethod, UUID> {

    boolean existsByTitleIgnoreCase(String title);

    boolean existsByTitleIgnoreCaseAndIdNot(String title, UUID id);

    List<DistributionMethod> findAllByOrderByCreatedAtAsc();
}

package com.moneytrail.api.revenuetype;

import java.util.List;
import java.util.UUID;

public interface RevenueTypeService {

    RevenueType create(String name);

    List<RevenueType> findAll();

    RevenueType findById(UUID id);

    RevenueType update(UUID id, String name);

    void delete(UUID id);
}

package com.zunigatomas.barilibro.purchase_service.repository;

import com.zunigatomas.barilibro.purchase_service.model.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PurchaseRepository extends MongoRepository<Purchase, String> {
    List<Purchase> findByUserId(String userId);
}

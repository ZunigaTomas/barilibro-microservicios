package com.zunigatomas.barilibro.purchase_service.controller;

import com.zunigatomas.barilibro.purchase_service.model.Purchase;
import com.zunigatomas.barilibro.purchase_service.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public Purchase createPurchase(@RequestBody Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @GetMapping("/{id}")
    public Purchase getPurchase(@PathVariable String id) {
        return purchaseRepository.findById(id).orElse(null);
    }

    @GetMapping("/user/{userId}")
    public List<Purchase> getPurchasesByUserId(@PathVariable String userId) {
        return purchaseRepository.findByUserId(userId);
    }

    @PutMapping("/{id}")
    public Purchase updatePurchase(@PathVariable String id, @RequestBody Purchase purchase) {
        purchase.setId(id);
        return purchaseRepository.save(purchase);
    }

    @DeleteMapping("/{id}")
    public void deletePurchase(@PathVariable String id) {
        purchaseRepository.deleteById(id);
    }
}

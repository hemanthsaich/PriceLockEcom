package com.example.pricelock.repository;

import com.example.pricelock.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    // Add custom queries if needed
}

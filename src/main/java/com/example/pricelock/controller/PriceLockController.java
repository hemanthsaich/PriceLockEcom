package com.example.pricelock.controller;

import com.example.pricelock.model.PriceLock;
import com.example.pricelock.service.PriceLockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/price-lock")
public class PriceLockController {

    @Autowired
    private PriceLockService priceLockService;

    // Lock price for a product
    @PostMapping
    public PriceLock lockPrice(@RequestParam Long productId, @RequestParam Double lockPercentage) {
        return priceLockService.lockProductPrice(productId, lockPercentage);
    }

    // Unlock expired prices (should be scheduled to run automatically)
    @PostMapping("/unlock-expired")
    public void unlockExpiredPrices() {
        priceLockService.unlockExpiredPrices();
    }
}

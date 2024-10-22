package com.example.pricelock.service;

import com.example.pricelock.model.PriceLock;
import com.example.pricelock.model.Product;
import com.example.pricelock.model.Purchase;
import com.example.pricelock.repository.PriceLockRepository;
import com.example.pricelock.repository.ProductRepository;
import com.example.pricelock.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private PriceLockRepository priceLockRepository;

    @Autowired
    private ProductRepository productRepository;

    // Create a purchase with the locked price
    public Purchase purchaseProduct(Long priceLockId) {
        Optional<PriceLock> priceLockOpt = priceLockRepository.findById(priceLockId);

        if (priceLockOpt.isPresent()) {
            PriceLock priceLock = priceLockOpt.get();

            // Check if the price lock is still valid (not expired)
            if (priceLock.getUnlockTime().isAfter(LocalDateTime.now())) {
                Purchase purchase = new Purchase();
                purchase.setProduct(priceLock.getProduct());
                purchase.setPriceLock(priceLock);
                purchase.setPurchaseDate(LocalDateTime.now());
                purchase.setFinalPrice(priceLock.getLockedPrice());

                // Save and return the purchase
                return purchaseRepository.save(purchase);
            } else {
                throw new RuntimeException("Price lock has expired.");
            }
        }

        throw new RuntimeException("Price lock not found.");
    }
}

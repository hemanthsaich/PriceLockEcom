package com.example.pricelock.service;

import com.example.pricelock.model.PriceLock;
import com.example.pricelock.model.Product;
import com.example.pricelock.repository.PriceLockRepository;
import com.example.pricelock.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceLockService {

    @Autowired
    private PriceLockRepository priceLockRepository;

    @Autowired
    private ProductRepository productRepository;

    // Lock price for a product
    public PriceLock lockProductPrice(Long productId, Double lockPercentage) {
        Product product = productRepository.findById(productId)
            .orElseThrow(() -> new RuntimeException("Product not found"));

        // Calculate the locked price
        Double lockedPrice = product.getOfferPrice() * (1 - lockPercentage / 100);

        PriceLock priceLock = new PriceLock();
        priceLock.setProduct(product);
        priceLock.setLockedPrice(lockedPrice);
        priceLock.setLockPercentage(lockPercentage);
        priceLock.setLockTime(LocalDateTime.now());
        priceLock.setUnlockTime(LocalDateTime.now().plusDays(10)); // Set unlock time to 10 days later

        return priceLockRepository.save(priceLock);
    }

//    // Unlock price (if 10 days have passed)
//    public void unlockExpiredPrices() {
//        List<PriceLock> expiredLocks = priceLockRepository.findByUnlockTimeBefore(LocalDateTime.now());
//        
//        // Unlock prices by removing locks
//        for (PriceLock lock : expiredLocks) {
//            // You may add custom logic here, like sending notifications to users
//            priceLockRepository.delete(lock);
//        }
//    }
    
    // Automatically unlock prices every day at midnight
    @Scheduled(cron = "0 0 0 * * ?")
    public void unlockExpiredPrices() {
        // Your unlock logic here
        List<PriceLock> expiredLocks = priceLockRepository.findByUnlockTimeBefore(LocalDateTime.now());
        
        for (PriceLock lock : expiredLocks) {
            priceLockRepository.delete(lock);
        }
    }
}

package com.example.pricelock.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PriceLock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Double lockedPrice;

    private Double lockPercentage;

    private LocalDateTime lockTime;

    private LocalDateTime unlockTime;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getLockedPrice() {
        return lockedPrice;
    }

    public void setLockedPrice(Double lockedPrice) {
        this.lockedPrice = lockedPrice;
    }

    public Double getLockPercentage() {
        return lockPercentage;
    }

    public void setLockPercentage(Double lockPercentage) {
        this.lockPercentage = lockPercentage;
    }

    public LocalDateTime getLockTime() {
        return lockTime;
    }

    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    public LocalDateTime getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(LocalDateTime unlockTime) {
        this.unlockTime = unlockTime;
    }
}

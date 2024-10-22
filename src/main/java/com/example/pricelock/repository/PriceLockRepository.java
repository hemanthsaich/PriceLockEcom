package com.example.pricelock.repository;

import com.example.pricelock.model.PriceLock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceLockRepository extends JpaRepository<PriceLock, Long> {
    // Retrieve locks that need unlocking
    List<PriceLock> findByUnlockTimeBefore(LocalDateTime now);
}

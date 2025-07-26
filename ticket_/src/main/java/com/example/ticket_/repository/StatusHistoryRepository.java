package com.example.ticket_.repository;

import com.example.ticket_.model.StatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusHistoryRepository extends JpaRepository<StatusHistory, Long> {
    // You can add custom query methods here if needed
}

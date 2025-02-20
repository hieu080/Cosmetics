package org.example.api.repository;

import org.example.api.entity.OrderDetailHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailHistoryRepository extends JpaRepository<OrderDetailHistory, Integer> {
}

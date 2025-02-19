package com.self.order.domain.repository;

import com.self.order.domain.entity.OrderCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCartRepository extends JpaRepository<OrderCart, Long> {
}

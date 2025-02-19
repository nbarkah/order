package com.self.order.service;

import com.self.order.domain.entity.OrderCart;

import java.util.Optional;

public interface OrderCartService {
    OrderCart save(OrderCart cart);
    Optional<OrderCart> getById(Long id);
}

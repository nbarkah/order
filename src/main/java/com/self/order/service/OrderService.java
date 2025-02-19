package com.self.order.service;

import com.self.order.domain.entity.Order;

public interface OrderService {
    Order placeOrder(Order order);
}

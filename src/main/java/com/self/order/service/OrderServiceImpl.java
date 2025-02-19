package com.self.order.service;

import com.self.order.domain.entity.Order;
import com.self.order.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Order order) {
        Order savedOrder = new Order();
        savedOrder.setCustomer(order.getCustomer());
        savedOrder.setAddress(order.getAddress());
        savedOrder.setItems(order.getItems());
        return orderRepository.save(savedOrder);
    }
}

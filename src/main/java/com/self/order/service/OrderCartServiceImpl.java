package com.self.order.service;

import com.self.order.domain.entity.OrderCart;
import com.self.order.domain.repository.OrderCartRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderCartServiceImpl implements OrderCartService {
    private OrderCartRepository orderCartRepository;

    public OrderCartServiceImpl(OrderCartRepository orderCartRepository) {
        this.orderCartRepository = orderCartRepository;
    }

    public OrderCart save(OrderCart cart) {
        OrderCart savedCart = new OrderCart();
        savedCart.setCustomer(cart.getCustomer());
        savedCart.setAddress(cart.getAddress());
        savedCart.setItems(cart.getItems());
        return orderCartRepository.save(savedCart);
    }

    public Optional<OrderCart> getById(Long id) {
        return orderCartRepository.findById(id);
    }
}

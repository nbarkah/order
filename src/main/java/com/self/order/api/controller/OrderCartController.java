package com.self.order.api.controller;

import com.self.order.domain.entity.OrderCart;
import com.self.order.service.OrderCartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class OrderCartController {
    private OrderCartService orderCartService;

    public OrderCartController(OrderCartService orderCartService) {
        this.orderCartService = orderCartService;
    }

    @PostMapping
    public ResponseEntity<OrderCart> addToCart(@RequestBody OrderCart cart) {
        return ResponseEntity.ok(orderCartService.save(cart));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderCart> getCart(@PathVariable Long id) {
        return orderCartService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
package com.self.order.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItem {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Double totalPrice;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

package com.self.order.service;

import com.self.order.domain.entity.Product;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    Optional<Product> getById(Long id);
    Page<Product> getAll(int page, int size);
    void delete(Long id);
}

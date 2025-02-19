package com.self.order.service;

import com.self.order.domain.entity.Product;
import com.self.order.domain.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        Product savedProduct = new Product();
        savedProduct.setName(product.getName());
        savedProduct.setType(product.getType());
        savedProduct.setPrice(product.getPrice());
        savedProduct.setQuantity(product.getQuantity());
        return productRepository.save(savedProduct);
    }

    public Optional<Product> getById(Long id) {
        return productRepository.findById(id);
    }

    public Page<Product> getAll(int page, int size) {
        return productRepository.findAll(PageRequest.of(page, size));
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}

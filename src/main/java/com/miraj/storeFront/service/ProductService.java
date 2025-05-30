package com.miraj.storeFront.service;

import com.miraj.storeFront.model.Product;
import com.miraj.storeFront.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsById(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}

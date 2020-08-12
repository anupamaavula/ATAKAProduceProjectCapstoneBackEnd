package com.tts.ecommerce.service;

import com.tts.ecommerce.model.Product;
import com.tts.ecommerce.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

}
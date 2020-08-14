package com.tts.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.ecommerce.model.Product;
import com.tts.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
	
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    public Product findProductName(String name) {
    	return productRepository.findByName(name);
    }
    
    public void deleteProduct(String name) {
    	productRepository.deleteByName(name);
    }
	
}
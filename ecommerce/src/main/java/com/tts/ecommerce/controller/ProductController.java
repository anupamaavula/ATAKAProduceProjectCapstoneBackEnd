package com.tts.ecommerce.controller;

import com.tts.ecommerce.model.Product;
import com.tts.ecommerce.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
    
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

}
package com.tts.ecommerce.service;

import com.tts.ecommerce.model.Product;

public interface ProductService {

    public Iterable<Product> getAllProducts();

    public Product getProduct(Long id);

    public Product save(Product product);

}
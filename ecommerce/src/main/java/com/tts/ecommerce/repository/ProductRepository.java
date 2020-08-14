package com.tts.ecommerce.repository;

import com.tts.ecommerce.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	public Product findByName(String name);
	
	public void deleteByName(String name);
	
}
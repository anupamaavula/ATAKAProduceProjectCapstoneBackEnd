package com.tts.ecommerce.controller;

import com.tts.ecommerce.model.Product;
import com.tts.ecommerce.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "products")
public class ProductController {
	
    private ProductService productService;

    @GetMapping("/get")
    public Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
    
    @PostMapping("/add")
    public void createProduct(@RequestBody Product product) {
    	productService.save(product);
    }
    
//    @PutMapping("/update")
//    public void updateProduct(@RequestBody Product product) {
//    	if(productService.existsProductByName(product.getName())) {
//    		
//    	} else {
//    		createProduct(product);
//    	}
//    }
    
    @DeleteMapping("/delete")
    public void deleteProduct(@PathVariable("name") String name) {
    	productService.deleteProduct(name);
    }
    
}
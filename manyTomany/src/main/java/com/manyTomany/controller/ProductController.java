package com.manyTomany.controller;


import com.manyTomany.entity.Product;
import com.manyTomany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create a new product
    @PostMapping("/save")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }



    // Add a customer to a product
    @PostMapping("/{productId}/addCustomer/{customerId}")
    public Product addCustomerToProduct(@PathVariable Long productId, @PathVariable Long customerId) {
        return productService.addCustomerToProduct(productId, customerId);
    }
}

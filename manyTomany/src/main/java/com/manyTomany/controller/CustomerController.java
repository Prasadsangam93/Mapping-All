package com.manyTomany.controller;

import com.manyTomany.entity.Customer;
import com.manyTomany.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Create a new customer
    @PostMapping("/save")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // Add a product to a customer
    @PostMapping("/{customerId}/addProduct/{productId}")
    public Customer addProductToCustomer(@PathVariable Long customerId, @PathVariable Long productId) {
        return customerService.addProductToCustomer(customerId, productId);
    }
}

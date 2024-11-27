package com.manyToOneMapping.controller;

import com.manyToOneMapping.entity.Customer;
import com.manyToOneMapping.service.CustomerService;
import com.manyToOneMapping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;



    @PostMapping("/save")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }





//    @PostMapping("/{customerId}/products")
//    public ResponseEntity<Void> addProduct(@PathVariable Long customerId, @RequestBody Product product) {
//        customerService.addProductToCustomer(customerId, product);
//        return ResponseEntity.ok().build();
//    }

}
package com.manyTomany.service;

import com.manyTomany.entity.Customer;
import com.manyTomany.entity.Product;

import java.util.List;
import java.util.Set;

public interface CustomerService {


    Customer saveCustomer(Customer customer);


    Customer addProductToCustomer(Long customerId, Long productId);
}

package com.manyToOneMapping.service;

import com.manyToOneMapping.entity.Customer;
import com.manyToOneMapping.repository.CustomerRepository;
import com.manyToOneMapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

}

//    @Override
//    public void addProductToCustomer(Long customerId, Product product) {
//        Customer customer = customerRepository.findById(customerId).orElseThrow();
//        customer.addProduct(product);
//        customerRepository.save(customer);
//    }






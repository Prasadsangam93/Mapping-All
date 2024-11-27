package com.manyTomany.service;

import com.manyTomany.entity.Customer;
import com.manyTomany.entity.Product;
import com.manyTomany.repository.CustomerRepository;
import com.manyTomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);

    }



    @Override
    public Customer addProductToCustomer(Long customerId, Long productId) {

            Customer customer = customerRepository.findById(customerId).orElse(null);
            Product product = productRepository.findById(productId).orElse(null);
            if (customer != null && product != null) {


                 customer.getProducts().add(product);
                customerRepository.save(customer);
                productRepository.save(product);
            }
            return customer;
        }
    }

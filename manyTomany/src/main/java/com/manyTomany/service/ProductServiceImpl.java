package com.manyTomany.service;


import com.manyTomany.entity.Customer;
import com.manyTomany.entity.Product;
import com.manyTomany.repository.CustomerRepository;
import com.manyTomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }

    @Override
    public Product addCustomerToProduct(Long productId, Long customerId) {
        Product product = productRepository.findById(productId).orElse(null);
        Customer customer = customerRepository.findById(customerId).orElse(null);


        if (product != null && customer != null) {
           customer.getProducts().add(product);
            productRepository.save(product);
            customerRepository.save(customer);
        }
        return product;
    }

}



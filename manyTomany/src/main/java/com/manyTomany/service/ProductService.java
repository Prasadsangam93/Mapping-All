package com.manyTomany.service;


import com.manyTomany.entity.Customer;
import com.manyTomany.entity.Product;

import java.util.List;
import java.util.Set;

public interface ProductService {


    Product saveProduct(Product product);


    Product addCustomerToProduct(Long productId, Long customerId);
}

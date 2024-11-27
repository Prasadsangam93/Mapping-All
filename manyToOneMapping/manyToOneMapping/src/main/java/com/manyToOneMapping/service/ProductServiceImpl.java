package com.manyToOneMapping.service;

import com.manyToOneMapping.entity.Product;
import com.manyToOneMapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductRepository productRepository;



    @Override
    public Product save(Product product) {
        return productRepository.save(product);

    }
}

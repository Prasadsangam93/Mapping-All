package com.manyToOneMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_tab")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String name;
    private String email;
    private Long phoneNumber;
    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products = new ArrayList<>(); // A customer can have many products



//
//    public void addProduct(Product product) {
//        products.add(product);
//        product.setCustomer(this); // Set the product's customer reference
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//        product.setCustomer(null); // Clear the product's customer reference
//
//   }


}

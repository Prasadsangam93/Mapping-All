package com.manyTomany.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_TABLE2")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String name;
    private String email;
    private Long phoneNumber;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Product.class)
    @JoinTable(name = "CUSTOMER2_PRODUCT2_TABLE",
            joinColumns = {@JoinColumn(name = "customer_Id", referencedColumnName = "customerId")},
            inverseJoinColumns = {@JoinColumn(name = "product_Id", referencedColumnName = "productId")})

    private List<Product> products;

}

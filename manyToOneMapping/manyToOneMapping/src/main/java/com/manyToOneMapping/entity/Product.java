package com.manyToOneMapping.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_tab")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private String name;
    private Double price;
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "customer_id") // Column in product_tab that references customer_tab
    private Customer customer;
}

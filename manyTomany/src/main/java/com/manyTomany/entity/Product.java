package com.manyTomany.entity;


        import com.fasterxml.jackson.annotation.JsonBackReference;
        import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Set;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @Entity
        @Table(name = "PRODUCT_TABLE2")
        public class Product {

            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            private Long productId;

            private String productName;
            private Long quantity;
            private Double amount;

        }

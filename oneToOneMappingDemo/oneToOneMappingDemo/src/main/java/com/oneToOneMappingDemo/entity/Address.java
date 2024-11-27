package com.oneToOneMappingDemo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Address_Tab")
@Entity
public class Address    {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long AddressId;


}

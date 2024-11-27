package com.oneToOneMappingDemo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee_Tab")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long EmpID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Double  salary;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;
}

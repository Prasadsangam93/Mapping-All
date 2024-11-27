package com.springboot.oneTomanyMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_tab2")
@Entity
public class Employee  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long empId;
    private String name;
    private String email;

    private Double salary;
    private  Long mobile;

    @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(referencedColumnName = "empId", name = "emp_Id")
    private List<Address> address;
}

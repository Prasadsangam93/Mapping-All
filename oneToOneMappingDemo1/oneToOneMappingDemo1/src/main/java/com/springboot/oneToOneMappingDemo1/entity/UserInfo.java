package com.springboot.oneToOneMappingDemo1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_Info")
@Entity
public class UserInfo  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long userInfoId;
    private Long mobile;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;



}

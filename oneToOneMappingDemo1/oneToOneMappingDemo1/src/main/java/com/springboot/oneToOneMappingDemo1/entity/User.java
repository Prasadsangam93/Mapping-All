package com.springboot.oneToOneMappingDemo1.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_tab")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long  userId;
    private String userName;
    private String email;

    @OneToOne(cascade = CascadeType.ALL, fetch= FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "user_UserInfo")
    private UserInfo userInfo;

}

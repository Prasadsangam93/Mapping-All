package com.springboot.oneToOneMappingDemo1.service;


import com.springboot.oneToOneMappingDemo1.entity.User;

import java.util.List;

public interface UserService{


    User saveUser(User user);

    List<User> fetchAll();

    User findById(Long userId);
}

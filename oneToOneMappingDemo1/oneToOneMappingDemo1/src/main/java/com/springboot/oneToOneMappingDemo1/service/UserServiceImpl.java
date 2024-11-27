package com.springboot.oneToOneMappingDemo1.service;


import com.springboot.oneToOneMappingDemo1.entity.User;
import com.springboot.oneToOneMappingDemo1.repository.UserInfoRepository;
import com.springboot.oneToOneMappingDemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> fetchAll(){
        return userRepository.findAll();
    }

    public User findById(Long userId){
            Optional<User> user = userRepository.findById(userId);
            return user.get();

    }
}

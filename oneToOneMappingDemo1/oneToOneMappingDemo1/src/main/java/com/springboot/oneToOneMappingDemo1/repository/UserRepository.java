package com.springboot.oneToOneMappingDemo1.repository;

import com.springboot.oneToOneMappingDemo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long > {
}

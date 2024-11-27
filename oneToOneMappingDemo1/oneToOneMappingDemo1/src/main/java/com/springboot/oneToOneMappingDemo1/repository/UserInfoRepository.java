package com.springboot.oneToOneMappingDemo1.repository;

import com.springboot.oneToOneMappingDemo1.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
}

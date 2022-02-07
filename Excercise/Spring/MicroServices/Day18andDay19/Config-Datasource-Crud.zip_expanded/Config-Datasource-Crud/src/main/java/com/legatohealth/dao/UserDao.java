package com.legatohealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legatohealth.bean.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

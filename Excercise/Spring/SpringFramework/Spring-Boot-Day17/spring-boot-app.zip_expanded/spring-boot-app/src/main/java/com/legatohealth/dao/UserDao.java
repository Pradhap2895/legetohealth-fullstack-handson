package com.legatohealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legatohealth.beans.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

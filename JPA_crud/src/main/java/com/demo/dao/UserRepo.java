package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.enteties.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}

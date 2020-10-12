package com.arpit.boot.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arpit.boot.example.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}

package com.arpit.boot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arpit.boot.example.dao.AdressRepository;
import com.arpit.boot.example.dao.UserRepository;
import com.arpit.boot.example.dto.OrderRequest;
import com.arpit.boot.example.entity.User;

@RestController
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private AdressRepository adressRepository;
  
  
  @PostMapping("/saveUserDetails")
  public User saveUserDetails(@RequestBody OrderRequest request) {

    return userRepository.save(request.getUser());

  }
  
  @GetMapping("/allUsers")
  public List<User> getAlluser(){
    return userRepository.findAll();
  }

}

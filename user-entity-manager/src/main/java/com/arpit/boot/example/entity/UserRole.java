package com.arpit.boot.example.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserRole {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int roleId;
  private String roleName;

}

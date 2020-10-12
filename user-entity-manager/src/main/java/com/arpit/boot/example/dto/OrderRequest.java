package com.arpit.boot.example.dto;

import com.arpit.boot.example.entity.User;

public class OrderRequest {
  private User user;
  
  public OrderRequest() {
    
  }
  
  public OrderRequest(User user) {
    this.user=user;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
  
  
  

}

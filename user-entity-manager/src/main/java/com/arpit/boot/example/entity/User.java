package com.arpit.boot.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String email;
  private String gender;
  @OneToMany(targetEntity = Adress.class,cascade = CascadeType.ALL)
  @JoinColumn(name ="cp_fk",referencedColumnName = "id")
  private List<Adress> adress;
  
  @OneToMany(targetEntity = UserRole.class,cascade = CascadeType.ALL)
  private List<UserRole> role;
  
  public List<Adress> getAdress() {
    return adress;
  }
  public void setAdress(List<Adress> adress) {
    this.adress = adress;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender
        + ", products=" + adress + "]";
  }
  


  


}

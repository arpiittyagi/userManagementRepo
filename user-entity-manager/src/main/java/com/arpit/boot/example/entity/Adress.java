package com.arpit.boot.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Adress {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String adress;
 
  private String adress_type;
 
  private int pincode;
  

  public Adress() {

  }
  
  

  public Adress(String adress, String adress_type, int pincode) {
    super();
    this.adress = adress;
    this.adress_type = adress_type;
    this.pincode = pincode;
   
  }



  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public String getAdress_type() {
    return adress_type;
  }

  public void setAdress_type(String adress_type) {
    this.adress_type = adress_type;
  }

  public int getPincode() {
    return pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }



  @Override
  public String toString() {
    return "Adress [id=" + id + ", adress=" + adress + ", adress_type=" + adress_type + ", pincode="
        + pincode + "]";
  }

 
  
  


}

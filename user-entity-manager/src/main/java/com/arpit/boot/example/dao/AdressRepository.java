package com.arpit.boot.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arpit.boot.example.entity.Adress;

public interface AdressRepository extends JpaRepository<Adress, Integer> {

}

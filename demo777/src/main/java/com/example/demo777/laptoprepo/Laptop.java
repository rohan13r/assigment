package com.example.demo777.laptoprepo;

import java.math.BigDecimal;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
//
//
}

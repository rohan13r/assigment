package com.example.demo777.controller;

import com.example.demo777.laptoprepo.Laptop;
import com.example.demo777.laptoprepo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import com.example.demo777.laptoprepo.Laptop;
//import com.example.demo777.laptoprepo.LaptopRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;


@RestController
public class branchcon {
    @Autowired
    LaptopRepository lRepo;

    @GetMapping("/laptop/name")
    public ResponseEntity<List<Laptop>> getLaptopsByNameContains(@RequestParam String branch) {
        return new ResponseEntity<List<Laptop>>(lRepo.findByNameContaining(branch), HttpStatus.OK);
    }

//    @GetMapping("/laptops")
//    public ResponseEntity<List<Laptop>> getLaptopsByBrandContains(@RequestParam String cranch) {
//        return new ResponseEntity<List<Laptop>>(lRepo.findByBrandContaining(branch), HttpStatus.OK);
//    }
}

package com.example.demo777.laptoprepo;

import java.math.BigDecimal;
import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.demo777.laptoprepo.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    List<Laptop> findByNameContaining(String branch);


}

package com.example.smallsecuredwebapp.repository;

import com.example.smallsecuredwebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

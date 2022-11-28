package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Product;

public interface Product_Repo extends JpaRepository<Product, Integer> {

	Product findById(int id);
}

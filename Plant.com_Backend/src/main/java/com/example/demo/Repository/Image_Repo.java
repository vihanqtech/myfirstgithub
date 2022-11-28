package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Product_image;

public interface Image_Repo extends JpaRepository<Product_image, Integer> {

}

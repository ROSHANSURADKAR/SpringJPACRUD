package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Entity.Product;

@Repository
public interface PRepository extends JpaRepository<Product ,Integer> {

}

package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Entity.Library;


@Repository
public interface LRepository extends JpaRepository<Library ,Integer>{

}

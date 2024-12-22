package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Entity.student;

@Repository
public interface SRepository extends JpaRepository<student,Integer> {

}

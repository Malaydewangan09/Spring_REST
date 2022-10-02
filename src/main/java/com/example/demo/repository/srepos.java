package com.example.demo.repository;

import com.example.demo.controller.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface srepos extends JpaRepository<Student , Long> {



   public Student findByName(String iska);
    public Student findByNameIgnoreCase(String iska);
}

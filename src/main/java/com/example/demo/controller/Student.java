package com.example.demo.controller;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
//lombok

@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    //for validation
    @NotBlank(message = "please add a name")
    private String name ;
    private int age ;

    //using lombok (getter setter contructor)

//    public Student() {
//    }
//
//    public Student(Long id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getname() {
//        return name;
//    }
//
//    public void setname(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}

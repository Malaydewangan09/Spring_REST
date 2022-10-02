package com.example.demo.controller;

import com.example.demo.repository.srepos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
public class controller {


    //from app.config file

    @Value("${message.cong}")
    private String message ;

    @Autowired
    private srepos se ;
    private final Logger LOGGER =
        LoggerFactory.getLogger(Student.class);


    @GetMapping("/")
    public String welcom(){
        return message ;
    }
    @PostMapping("/hello")
    public Student hello(@Valid @RequestBody Student s){
        System.out.println("saved");
        LOGGER.info("saved student");
       return se.save(s) ;

    }
    @GetMapping("/students")
    public List<Student> home(){
        return se.findAll();
    }

    @GetMapping("/students/{id}")
    public Student feko(@PathVariable("id") Long id){
        return se.findById(id).get();
    }
    @GetMapping("/students/name/{naaam}")
    public Student naamfeko(@PathVariable("naaam") String naam){
        return se.findByNameIgnoreCase(naam);
    }

    @DeleteMapping("/{id}")
    public List<Student> hatao(@PathVariable("id") Long id){
        se.deleteById(id);
        return se.findAll();

    }
}

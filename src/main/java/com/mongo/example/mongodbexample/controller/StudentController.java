package com.mongo.example.mongodbexample.controller;

import com.mongo.example.mongodbexample.model.Student;
import com.mongo.example.mongodbexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student student1 = this.studentRepository.save(student);
        return ResponseEntity.ok(student1);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudents()
    {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}

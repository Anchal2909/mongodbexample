package com.mongo.example.mongodbexample.repository;

import com.mongo.example.mongodbexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student,Integer> {
}

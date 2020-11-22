package com.example.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.student.domain.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}

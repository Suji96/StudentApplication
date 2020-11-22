package com.example.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import com.example.student.domain.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studRep;

  public List<Student> getAllStudent() {
    return this.studRep.findAll();
  }

  public Student saveStudent(Student student) {
    return this.studRep.save(student);
  }

  public Student updateStudent(Student student) {
    return this.studRep.save(student);
  }

  public List<Student> getAllStudentOrderByName() {
    Order order = new Sort.Order(Direction.ASC, "studName");
    Sort sort = Sort.by(order);
    return this.studRep.findAll(sort);
  }

}

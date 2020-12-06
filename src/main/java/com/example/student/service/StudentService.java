package com.example.student.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
    List<Student> list = this.studRep.findAll();
    if (list.size() != 0) {
      List<Student> sort =
          list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
      return sort;
    } else {
      return new ArrayList<Student>();
    }
  }

}

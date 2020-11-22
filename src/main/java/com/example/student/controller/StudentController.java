package com.example.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.student.domain.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentController {

  @Autowired
  private StudentService studService;

  @PostMapping("/create/employee")
  public Student createEmployee(@RequestBody Student student) {
    return this.studService.saveStudent(student);
  }

  @PutMapping("/update/employee")
  public Student updateEmployee(@RequestBody Student student) {
    return this.studService.updateStudent(student);
  }

  @GetMapping("/dropdown/retrieve/student")
  public List<Student> getAllStudet() {
    return this.studService.getAllStudent();
  }

  @GetMapping("/dropdown/retrieve/order/name/student")
  public List<Student> getAllStudetOrderByName() {
    return studService.getAllStudentOrderByName();
  }
}

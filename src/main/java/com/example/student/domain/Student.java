package com.example.student.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "id")
  private String id;

  @Column(name = "stud_name")
  private String name;

  @Column(name = "date_of_birth")
  private Date date_of_birth;

  @Column(name = "gender")
  private String gender;

  @Column(name = "division")
  private String division;

  @Column(name = "class")
  private String classNum;
  
  @Column(name = "roll_no")
  private int roll_no;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate_of_birth() {
    return date_of_birth;
  }

  public void setDate_of_birth(Date date_of_birth) {
    this.date_of_birth = date_of_birth;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getClassNum() {
    return classNum;
  }

  public void setClassNum(String classNum) {
    this.classNum = classNum;
  }

  public int getRoll_no() {
    return roll_no;
  }

  public void setRoll_no(int roll_no) {
    this.roll_no = roll_no;
  }

}

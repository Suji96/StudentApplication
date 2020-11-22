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
  private String studName;

  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Column(name = "gender")
  private String gender;

  @Column(name = "division")
  private String division;

  @Column(name = "class")
  private String std;
  
  @Column(name = "roll_no")
  private int roll_no;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStudName() {
    return studName;
  }

  public void setStudName(String studName) {
    this.studName = studName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
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

  public String getStd() {
    return std;
  }

  public void setStd(String std) {
    this.std = std;
  }

  public int getRoll_no() {
    return roll_no;
  }

  public void setRoll_no(int roll_no) {
    this.roll_no = roll_no;
  }

}

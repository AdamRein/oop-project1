/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author 
 */

import java.util.List;
import java.util.Date;

class Instructor extends People {
    private List<String> courseList;
    private List<Student> advisees;
    private String program;

    public Instructor(String name, Date dob, String program, List<String> courseList, List<Student> advisees) {
        super(name, dob);
        this.program = program;
        this.courseList = courseList;
        this.advisees = advisees;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public List<Student> getAdvisees() {
        return advisees;
    }

    public void setAdvisees(List<Student> advisees) {
        this.advisees = advisees;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    public void addAdvisee(String student) {
        addAdvisee(student);
    }
}
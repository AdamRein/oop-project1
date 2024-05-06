/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author 
 */
import java.util.ArrayList;
import java.util.List;

public class Instructor extends People {
    private List<String> courseList;
    private List<Student> advisees;
    private Program program;

    public Instructor(String name, String dob, Program program, List<String> courseList, List<Student> advisees) {
        super(name, dob);
        this.program = program;
        this.courseList = new ArrayList<>(courseList);
        this.advisees = new ArrayList<>(advisees);
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

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
    
    public void addAdvisee(Student student) {
        
        this.advisees.add(student);
    }
    
    public void addCourseList(String CourseList) {
        
        this.courseList.add(CourseList);
    }
    
    
    @Override
    public String toString() {
        return getName(); // or any other representation you want
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ahshan
 */



public class Course {
    
   public String name;
   public Program program;
   private List<String> prerequisiteList;
   public Instructor instructor;
   private List<Student> studentList;
   
    // Constructor
 
    public Course (String name, Program program, List<String> prerequisiteList){
        this.name = name;
        this.program = program;
        this.prerequisiteList = new ArrayList<>(prerequisiteList);
        this.studentList = new ArrayList<>();
    }
   
   public Course (String name,Program program,Instructor instructor){
        this.name = name;
        this.program = program;
        this.prerequisiteList = new ArrayList<>();
        this.instructor = instructor;
        this.studentList = new ArrayList<>();
        
    }
    public Course(String name, Program program, List<String> prerequisiteList, Instructor instructor, List<Student> studentList) {
        this.name = name;
        this.program = program;
        this.prerequisiteList = new ArrayList<>(prerequisiteList);
        this.instructor = instructor;
        this.studentList = new ArrayList<>(studentList);
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public Program getProgram() {
        return program;
    }
    
    public void setProgram(Program program) {
        this.program = program;
    }
    
    public List<String> getPrerequisiteList(){
        return prerequisiteList;
    }
    
    public void setPrequisiteList(List<String> prequisiteList){
        this.prerequisiteList = prequisiteList; 
    }
    
     // adding prereq
    public void addPrerequisite(String course){
        prerequisiteList.add(course);
    }
     // removing prereq
    public void removePrerequisite(String course){
       prerequisiteList.remove(course);
    }
   
    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    //getters for studentList
    public List<Student> getStudentList(){
        return studentList;
    }
    
    //setters 
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }
    
    //adding students 
    
    public void addStudent(Student student){
        this.studentList.add(student);
    }
    
    //remove students
    
    public void removeStudent(Student student){
        studentList.remove(student);
    }    
    
    @Override
    public String toString() {
        return name; // or any other representation you want
    }
}
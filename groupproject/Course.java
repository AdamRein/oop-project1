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
        this.prerequisiteList = prerequisiteList;
        this.instructor = instructor;
        this.studentList = studentList;
    }
    
    //getters for prereq list
    
    public List<String> getPrerequisiteList(){
        return prerequisiteList;
    }
    
    //setter
    
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
        studentList.add(student);
    }
    
    //remove students
    
    public void removeStudent(Student student){
        studentList.remove(student);
    }    
}

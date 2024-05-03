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
import java.util.Date;

public class Student extends People {
    
    private String program;
    private Date start_date;
    private String advisor;
    private ArrayList<String> course_list;

    public Student(String name, Date dob, String program, Date start_date, String advisor) {
        super(name, dob); 
        this.program = program;
        this.start_date = start_date;
        this.advisor = advisor;
        this.course_list = new ArrayList<>();
    }

    public String get_program() {
        return program;
    }

    public void set_program(String program) {
        this.program = program;
    }

    public Date get_start_date() {
        return start_date;
    }

    public void set_start_date(Date start_date) {
        this.start_date = start_date;
    }

    public String get_advisor() {
        return advisor;
    }

    public void set_advisor(String advisor) {
        this.advisor = advisor;
    }

    public void add_course(String course) {
        course_list.add(course);
    }

    public void remove_course(String course) {
        course_list.remove(course);
    }

    public ArrayList<String> get_course_list() {
        return course_list;
    }
    
}

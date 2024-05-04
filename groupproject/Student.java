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
import java.util.List;

public class Student extends People {
    
    private Program program;
    private String start_date;
    private String advisor;
    private ArrayList<Course> course_list;

    public Student(String name, String dob, Program program , List<String> courseNames , String start_date, String advisor) {
        super(name, dob); 
        this.program = program;
        this.start_date = start_date;
        this.advisor = advisor;
        this.course_list = convertCourseNamesToCourses(courseNames);
    }
    
private ArrayList<Course> convertCourseNamesToCourses(List<String> courseNames) {
        ArrayList<Course> courses = new ArrayList<>();
        // Assuming you have access to a list of all courses
        for (String courseName : courseNames) {
            for (Course course : gui.courseOfList) {
                if (course.name.equals(courseName)) {
                    courses.add(course);
                    break;
                }
            }
        }
        return courses;
    }

    

    public Program get_program() {
        return program;
    }

    public void set_program(Program program) {
        this.program = program;
    }

    public String get_start_date() {
        return start_date;
    }

    public void set_start_date(String start_date) {
        this.start_date = start_date;
    }

    public String get_advisor() {
        return advisor;
    }

    public void set_advisor(String advisor) {
        this.advisor = advisor;
    }

    public void add_course(Course course) {
        course_list.add(course);
    }

    public void remove_course(Course course) {
        course_list.remove(course);
    }

    public List<Course> get_course_list() {
        return course_list;
    }
    
}

package com.mycompany.groupproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.groupproject;

/**
 *
 * @author stone
 */
import java.util.ArrayList;
import java.util.List;

public class Calling {
    
    // You may need to pass instructorList and studentList as parameters
    public void saveAssignAdvisor(String advisor, String studentName) {
    // Loop through the list of instructors
    for (Instructor instructor : gui.instructorList) {
        // Check if the instructor name matches the advisor
        if (instructor.getName().equals(advisor)) {
            // Find the student with the given name
            for (Student student : gui.studentList) {
                if (student.getName().equals(studentName)) {
                    student.set_advisor(advisor);
                    instructor.addAdvisee(student);
                    break;
                }
            }
            break;
        }
    }
}

  
    public void registerStudent(String studentName, String courseName) {
        for (Student student : gui.studentList) {
            if (student.getName().equals(studentName)) {
                for (Course course : gui.courseOfList) {
                    if (course.getName().equals(courseName)) { 
                        if (course.getStudentList().contains(student)) {
                            break; 
                        } else {
                            student.add_course_list(courseName);
                            course.addStudent(student);
                        }
                    }
                }
            }
        }
    }


    public void registerInstructor(String instructorName, String courseName) {
        for (Instructor instructor : gui.instructorList) {
            if (instructor.getName().equals(instructorName)) {
                for (Course course : gui.courseOfList) {
                    if (course.getName().equals(courseName)) {
                        if (course.getInstructor() != null && course.getInstructor().equals(instructor)) {//?
                            break; 
                        } else {
                            course.setInstructor(instructor);
                            List<String> instructorCourseList = instructor.getCourseList();
                            if (instructorCourseList == null) {
                                instructorCourseList = new ArrayList<>();
                            }
                            instructor.addCourseList(courseName);
                        }
                    }
                }
            }
        }
    }

    
    
    //    public Program(String name, String college, String type, int totalCredits) {
    public void addProgram(String programName, String college, String type, int credits) {
        for (Program program : gui.programList) {
            if (program.getName().equals(programName)){
                break;
            } else {
                createProgram(programName, college, type, credits);
            }
        }
    }
    
    public Program createProgram(String name, String college, String type, int totalCredits) {
        Program newProgram = new Program(name, college, type, totalCredits);
        gui.programList.add(newProgram); // Add the new program to the list
        return newProgram;
    }
    
    public void addStudent(String studentName, String DOB, String programName, String startDate) {
        for (Student student : gui.studentList) {
            if (student.getName().equals(studentName)){
                break;
            } else {
                for (Program program : gui.programList) {
                    if (program.getName().equals(programName)) {
                        Program studentProgram = program;
                        createStudent(studentName, DOB, studentProgram, startDate);
                    }
                }
            }
        }
    }
    
    public Student createStudent(String name, String DOB, Program studentProgram, String startDate) {
        Student newStudent = new Student(name, DOB, studentProgram, null, startDate, null);
        gui.studentList.add(newStudent);
        return newStudent;
    }
    
    public void addInstructor(String instructorName, String DOB, String programName) {
        for (Instructor instructor : gui.instructorList){
            if(instructor.getName().equals(instructorName)){
                break;
            } else {
                for (Program program : gui.programList) {
                    if (program.getName().equals(programName)) {
                        Program instructorProgram = program;
                        createInstructor(instructorName, DOB, instructorProgram);
                    }
                }
            }
        }
    }
    
    public Instructor createInstructor(String name, String DOB, Program instructorProgram) {
        Instructor newInstructor = new Instructor(name, DOB, instructorProgram, null, null);
        gui.instructorList.add(newInstructor);
        return newInstructor;
    }

    public void addCourse(String courseName, String programName, List<String> preReqNames) {
    for (Course course : gui.courseOfList){
        if (course.getName().equals(courseName)){
            break;
        } else {
            for (Program program : gui.programList) {
                if (program.getName().equals(programName)) {
                    Course newCourse = createCourse(courseName, program, preReqNames);
                    gui.courseOfList.add(newCourse);
                }
            }            
        }
    }
    }

    public Course createCourse(String name, Program courseProgram, List<String> preReqNames) {
    // Assuming prerequisiteList is initialized in the Course constructor
    Course newCourse = new Course(name, courseProgram, preReqNames, null, null);
    return newCourse;
}
}

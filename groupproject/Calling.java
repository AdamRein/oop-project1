/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author stone
 */
import java.util.List;

public class Calling {
    
    // You may need to pass instructorList and studentList as parameters
    public void saveAssignAdvisor(String advisor, String studentName) {
        // Loop through the list of instructors
        for (Instructor instructor : gui.instructorList) {
            // Check if the instructor's name matches the advisor
            if (instructor.getName().equals(advisor)) {
                // Find the student with the given name
                for (Student student : gui.studentList) {
                    if (student.getName().equals(studentName)) {
                        // Add the student to the instructor's list of advisees
                        instructor.addAdvisee(student);
                        // Set the instructor as the advisor for the student
                        student.set_advisor(advisor);
                        break;
                    }
                }
                break; 
            }
        }
    }
    
    public String studentCoures(String studentName, List<Student> studentList) {
        String studentInfo = "";
        for (Student student : studentList) {
            if (student.getName().equals(studentName)) {
                studentInfo += student.get_course_list() + "\n";
            break;
            }
        }
    return studentInfo;
    }
    
  
   public void registerStudent(String studentName, String courseName) {
    for (Student student : gui.studentList) {
        if (student.getName().equals(studentName)) {
            for (Course course : gui.courseOfList) {
                if (course.name.equals(courseName)) { 
                    if (course.getStudentList().contains(student)) {
                        break; 
                    } else {

                        course.addStudent(student);
                        student.add_course(course);
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
                   if (course.name.equals(courseName)) {
                       if (course.instructor != null && course.instructor.equals(instructor)) {
                        break; 
                        } else {
                            course.instructor =instructor;
                        }
                    }
                }
            }
        }
    }
}

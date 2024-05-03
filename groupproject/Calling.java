/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author stone
 */
public class Calling {
    public void saveAssignAdvisor(String advisor, String studentName) {
    // Loop through the list of instructors
        for (Instructor instructor : instructorList) {
        // Check if the instructor's name matches the advisor
            if (instructor.getName().equals(advisor)) {
            // Add the student to the instructor's list of advisees
               instructor.addAdvisee(studentName);
               
               // Find the student with the given name
                for (Student student : studentList) {
                    if (student.getName().equals(studentName)) {
                       // Set the instructor as the advisor for the student
                        student.set_advisor(advisor);
                        break; // Exit the loop after setting the advisor
                    }
                    
                }
                break; // Exit the loop after adding the student
            }
        }
    }
    
    public void searchStudent(String student) {
        Student foundStudent = searchStudentByName(studentList, searchName);
        if (foundStudent != null) {
            new StudentDetailsFrame(foundStudent);
        } else {
            JOptionPane.showMessageDialog(this, "Student with name '" + searchName + "' not found.", "Student Not Found", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}

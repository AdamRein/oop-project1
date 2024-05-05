/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author stone
 */

public class Program {
    private String name;
    private String college;
    private String type;
    private int totalCredits;

    // Constructor
    public Program(){
        this.name = "";
        this.college = "";
        this.type = "";
        this.totalCredits = 0;
    }
            
    public Program(String name, String college, String type, int totalCredits) {
        this.name = name;
        this.college = college;
        this.type = type;
        this.totalCredits = totalCredits;
    }
    
    //seting and geting varables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }
    
    @Override
    public String toString() {
        return name; // or any other representation you want
    }
}
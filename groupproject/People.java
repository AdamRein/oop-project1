/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author stone
 */
import java.util.Date;
public class People {
    private String Name;
    private Date DOB;
    
    
    // Constructor
    public People(){
        this.Name = "";
        this.DOB = new Date(0);
    }
    public People(String Name, Date DOB){
        this.Name = Name;
        this.DOB = DOB;
    }
    
    //seting and geting varables
    public void setName(String setName) {
        this.Name = setName;
    }
     public String getName() {
        return Name;
    }
    
     public void setDOB(Date setDOB) {
        this.DOB = setDOB;
    }
     public Date getDOB() {
        return DOB;
    }
    
}

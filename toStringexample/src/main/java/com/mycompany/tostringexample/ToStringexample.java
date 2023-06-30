/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tostringexample;

/**
 *
 * @author dnyaneshwar
 */
public class ToStringexample {

    public static void main(String[] args) {
        student ref = new student(12,"dnyaneshwar");
        System.out.println(ref);
        
    }
}
class student
{
    private int rollno;
    private String name;

    public student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" + "rollno=" + rollno + ", name=" + name + '}';
    }

   
    
    
}

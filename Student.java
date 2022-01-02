/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentDatabaseApp;

import java.util.Scanner;
/**
 *
 * @author lauta
 */
public class Student {
    private String firstName;
    private String lastName;
    private int classLevel;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int courseCost = 600;
    private static int id = 1000;
    
    public Student(){
        // Prompt user to enter name and year
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER STUDENT FIRST NAME:");
        this.firstName = in.nextLine();
        
        System.out.println("ENTER STUDENT LAST NAME:");
        this.lastName = in.nextLine();
        
        System.out.println("ENTER STUDENT CLASS LEVEL:\n1 FOR FRESHMAN\n2 FOR SOPHOMORE\n3 FOR JUNIOR\n4 FOR SENIOR\n");
        this.classLevel = in.nextInt();
        
        System.out.println(this.firstName + this.lastName + this.classLevel);
        
        setStudentId();
        System.out.println(this.studentId);
        
    }
    
    // Generate a unique ID
    private void setStudentId(){
        // Grade level + static id
        id++;
        this.studentId = this.classLevel + "" + id;
    }
        
    // Enroll in courses
    public void enroll(){
        
    }
    
    // View balance
        
    // Pay tuition
        
    // Show status
}

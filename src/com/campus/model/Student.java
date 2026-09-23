package com.campus.model;

public class Student {
    //Encapsulation data hiding
    //instance variables
    private int studentId;
    private String studentName;
    private int studentAge;
    private String department;
    private int[] marks;
    
    //static variable
    static int studentCount = 0;
    
    //default constructor
    public Student() {
        studentCount++;
    }
    //parameterized constructor
    public Student(int studentId, String studentName, int studentAge, String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }
    //getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    //setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    //instance method
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Department: " + department);
        System.out.print("Marks: ");
        
    }
       public void displaystudenrinfo(boolean showmarks){
        displayStudentDetails();
        if(showmarks){
            System.out.print("Marks:" +java.util.Arrays.toString(marks));
        }    
    }
    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}

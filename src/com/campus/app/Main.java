package com.campus.app;

import com.campus.model.Student;
import com.campus.service.Studentservice;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        //inputs from users
        System.out.println("emter the student id");
        int studentid = sc.nextInt();
        System.out.println("enter the StudentName");
        sc.nextLine();
        String studentname = sc.nextLine();
        System.out.println("enter the Age");
        int age = sc.nextInt();
        System.out.println("enter the student department");
        sc.nextLine();
        String department = sc.nextLine();
        System.out.println("number of subjects");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("enter the marks of" +n+ "subjects");
        for (int i = 0; i < n; i++) {
            System.out.println("enter the marks of subject" +(i+1));
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        Student student = new Student(studentid, studentname, age, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        Studentservice studentService = new Studentservice();
        studentService.displayReportCard(student);
        }
}
    }
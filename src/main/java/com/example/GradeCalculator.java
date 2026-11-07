package com.example;

public class GradeCalculator {
    public static boolean isPass(double marks) {
        return marks >= 40.0;
    }

    public static String Grade(double marks) {
        if (marks >= 90) {
            return "Grade:O";
        } else if (marks >= 80) {
            return "Grade:A+";
        } else if (marks >= 70) {
            return "Grade:A";
        } else if (marks >= 60) {
            return "Grade:B+";
        } else if (marks >= 50) {
            return "Grade:B";
        } else if (marks >= 40) {
            return "Grade:C";
        } else {
            return "Grade:F";
        }
    }

    public static void main(String[] args) {
        int marks = 80;
        System.out.println("Result  : " + (isPass(marks) ? "PASS" : "FAIL"));
        System.out.println(Grade(marks));
    }
}
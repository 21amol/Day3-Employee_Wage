package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        // Welcome to employee wage program.
        double attendance = Math.floor(Math.random() * 10) % 2;
     //   System.out.println(attendance);
        if (attendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
        }
    }
}

package com.bridgelabz;

public class Main {

    static final int WAGE_PER_HOUR = 20;
    static final int Full_DAY_HOUR = 8;

    public static void main(String[] args) {
        // Welcome to employee wage program.

        int dailyEmpWage;
        double attendance = Math.floor(Math.random() * 10) % 2;
        //   System.out.println(attendance);

        if (attendance == 0) {
            System.out.println("Employee is Absent");
            dailyEmpWage = 0;
            System.out.println("Daily Employee Wage is :" +dailyEmpWage);
        } else {
            System.out.println("Employee is Present");
            dailyEmpWage = WAGE_PER_HOUR * Full_DAY_HOUR;
            System.out.println("Daily Employee Wage is :" +dailyEmpWage);
        }

    }
}

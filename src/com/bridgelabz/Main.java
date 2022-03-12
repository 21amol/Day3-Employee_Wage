package com.bridgelabz;

public class Main {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        // Welcome to employee wage program.

        int dailyEmpWage;
        double attendance = Math.floor(Math.random() * 10) % 3;
        //   System.out.println(attendance);

        if (attendance == 0) {                                              //Employee is Absent.
            System.out.println("Employee is Absent");
            dailyEmpWage = 0;
            System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        } else if (attendance == 1) {                                         //Employee is Present for part-time basics.
            System.out.println("Employee is Present for Part time");
            dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        } else {
            System.out.println("Employee is Present for Full time");      //Employee is present for full time.
            dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Employee Wage is :" + dailyEmpWage);
        }
    }
}

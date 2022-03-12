package com.bridgelabz;

public class Main {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULL_DAY_PRESENT = 2;
    static final int PART_TIME_PRESENT = 1;
    static final int ABSENT = 0;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        // Welcome to employee wage program.

        int dailyEmpWage = 0;
        //  int attendance = (int) Math.floor(Math.random() * 10) % 3;
        //   System.out.println(attendance);

     /*   if (attendance == 0) {                                              //Employee is Absent.
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
        }  */

        //Using Switch Case
        int totalWages = 0;
        int presentDaysFullTime = 0;
        int presentDaysPartTime = 0;
        int absentDays = 0;
        int monthlyWageFullTime = 0;
        int monthlyWagePartTime = 0;
        for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
            int attendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (attendance) {
                case (FULL_DAY_PRESENT):
                    // System.out.println("Employee is Present for Full time");      //Employee is present for full time.
                    dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    // System.out.println("Daily Employee Wage is :" + dailyEmpWage);
                    presentDaysFullTime = presentDaysFullTime + 1;
                    break;

                case (PART_TIME_PRESENT):
                    //  System.out.println("Employee is Present for Part time");
                    dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    // System.out.println("Daily Employee Wage is :" + dailyEmpWage);
                    presentDaysPartTime = presentDaysPartTime + 1;
                    break;

                default:
                    // System.out.println("Employee is Absent");
                    dailyEmpWage = 0;
                    // System.out.println("Daily Employee Wage is :" + dailyEmpWage);
                    absentDays = absentDays + 1;
            }
        }
        monthlyWageFullTime = presentDaysFullTime * WAGE_PER_HOUR * FULL_DAY_HOUR;
        monthlyWagePartTime = presentDaysPartTime * WAGE_PER_HOUR * PART_TIME_HOUR;
        totalWages = (monthlyWageFullTime + monthlyWagePartTime);
        System.out.println("Absent days:" + absentDays + " " + "Fully Present days:" + presentDaysFullTime + " " + "Partly Present days:" + presentDaysPartTime);
        System.out.println("Total monthly wages are : " + totalWages);
    }
}
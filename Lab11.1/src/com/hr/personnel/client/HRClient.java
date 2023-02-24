/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2400.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 8.0, 12.0));


        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1987, 5, 25), 25.00));
        dept.addEmployee(new HourlyEmployee("NotJosh", LocalDate.of(1988, 6, 26), 13.00, 40.0));
        dept.addEmployee(new ExecutiveEmployee("Wish it was Josh", LocalDate.of(1987, 5, 25), 25.00));




        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();
        dept.payEmployees();

        dept.holidayBreak();





    }
}
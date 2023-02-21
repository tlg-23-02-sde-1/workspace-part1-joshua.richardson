package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
//    Fields
    private double salary;



//    Constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
//        Regist in 401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        this.salary = salary;
    }



//    Business Methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary: "  + getSalary());
    }







//    Getters and Setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


//    toString

    @Override
    public String toString() {
        return String.format("%s, Salary: %.2f", super.toString(), getSalary());
    }
}
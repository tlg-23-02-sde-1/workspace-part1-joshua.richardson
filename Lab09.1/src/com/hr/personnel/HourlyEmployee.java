package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
//    Fields:
    private double rate;


    private double hours;

//    Constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    //    Business Methods
    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + getRate()*getHours()*HOURLY_TAX_RATE);
    }

    @Override
    public void pay(){
        System.out.println(this.getName() + " is paid hourly rate: $" + getRate()*getHours());
    }






//    Getters and Setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format("%s, Rate: %.2f, Hours: %f", super.toString(), getRate(), getHours());
    }
}
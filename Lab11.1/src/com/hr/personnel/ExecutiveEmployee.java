package com.hr.personnel;

import java.time.LocalDate;

public class ExecutiveEmployee extends SalariedEmployee{



//    Constructors
    public ExecutiveEmployee() {
        // Super in here whether you type it or not!
    }
    public ExecutiveEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public ExecutiveEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

//    Methods
    @Override
    public void work(){
        System.out.println(getName() + " is enjoying a nice round of golf.");
    }

}
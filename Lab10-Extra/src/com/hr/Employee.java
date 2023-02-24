package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * Option 1: Try-catch and handle any exception
     *
     */
    /*public void goToWork() {
        Car c = new Car("TKE123", "Toyota", "Matrix");
        try {
            c.start();
            c.moveTo("Tacoma");
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
            System.out.println(e);
        } finally {
            c.stop();
        }
    }*/
    /*
     * Option 2: "punt", i.e.. don't handle any thrown exception at all
     * NOTE that a try-finally can be used for the regular finally reasons
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("TKE123", "Toyota", "Matrix");
//        c.start();
//
//        try {
//            c.moveTo("West Seattle");
//        } finally {
//            c.stop();
//        }
//        System.out.println("Arrived at work");
//    }

    /*
     * Option 3: "catch and re-throw"
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("TKE123", "Toyota", "Matrix");
//        c.start();
//        try {
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e){
//            System.out.println("Emailing the city to complain... DO SOMETHING");
//            throw e;
//        }
//        finally {
//            c.stop();
//        }
//        System.out.println("Arrived at work");
//    }


    /*
     * Option 4: try-catch, but then throw a different one.
     * We are nesting the underlying 'cause' exception into a higher-level,
     * more HR-oriented exception, for our HR-oriented client.
     */
    public void goToWork() throws WorkException {
        Car c = new Car("TKE123", "Toyota", "Matrix");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e){
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop();
        }
        System.out.println("Arrived at work");
    }


    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}
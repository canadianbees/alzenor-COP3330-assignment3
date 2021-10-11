/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 42 employee class file
 *  Copyright 2021 Celina Alzenor
 */

package ex42;

public class Employee {

    private final String lastN;
    private final String firstN;
    private final String salary;

    public String getLastN() {
        return lastN;
    }

    public String getFirstN() {
        return firstN;
    }

    public String getSalary() {
        return salary;
    }

    public Employee(String lastN, String firstN, String salary) {
        this.lastN = lastN;
        this.firstN = firstN;
        this.salary = salary;
    }
}

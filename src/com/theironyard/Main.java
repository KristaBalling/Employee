package com.theironyard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from the Runnable")).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Time Buchaka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        System.out.println("Employees over 30: ");
        System.out.println("====================");
        for (Employee employee : employees) {
            if(employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        }
    }
}

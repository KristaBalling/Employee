package com.theironyard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge()> 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge()<= 30);


    }

        public static void printEmployeesByAge(List<Employee> employees,
                                               String ageText,
                                               Predicate<Employee> ageCondition) {
            System.out.println(ageText);
            System.out.println("====================");
            for(Employee employee : employees) {
                if(ageCondition.test(employee)) {
                    System.out.println(employee.getName());
                }

            }
        }
    }


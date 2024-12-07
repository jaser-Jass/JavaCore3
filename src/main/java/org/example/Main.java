package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Employee("John", 50000, 2020, 1, 1),
                new Employee("Jane", 60000, 2021, 1, 1),
                new Manager("Bob", 80000, 2019, 1, 1),
                new Employee("Alice", 70000, 2022, 1, 1)
        };

        System.out.println("Before raise:");
        Arrays.stream(employees).forEach(System.out::println);

        Manager.raiseSalary(employees, 10);

        System.out.println("After raise:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
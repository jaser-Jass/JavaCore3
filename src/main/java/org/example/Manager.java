package org.example;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
public class Manager extends Employee {


    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public static void raiseSalary(Employee[] employees, double increasePercentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary * (1 + increasePercentage / 100));
            }
        }
    }
}

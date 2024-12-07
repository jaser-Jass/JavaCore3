package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private double salary;
    private int year;
    private int month;
    private int day;

    public int compareDate(int year1, int month1, int day1) {
        return (this.year - year1) * 365 + (this.month - month1) * 30 + (this.day - day1);
    }
}

package com.example.mvchw;

import java.util.*;

public class EmployeeDAO {
    public static List<Employee> employees;
    static {
        employees = new ArrayList<>();
        java.sql.Date date = java.sql.Date.valueOf("2021-05-01");
        employees.add(new Employee("关羽", "SOLIDER", 8000, 7839, 10, date, 5000.0));
        employees.add(new Employee("张飞", "SOLIDER", 8001, 7839, 10, date, 5000.0));
        employees.add(new Employee("赵云", "SOLIDER", 8002, 7839, 10, date, 5000.0));
        employees.add(new Employee("马超", "SOLIDER", 8003, 7839, 10, date, 5000.0));
        employees.add(new Employee("黄忠", "SOLIDER", 8004, 7839, 10, date, 5000.0));
    }
}

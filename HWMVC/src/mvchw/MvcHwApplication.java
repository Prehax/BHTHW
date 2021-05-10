package com.example.mvchw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication
public class MvcHwApplication {

    public static void main(String[] args) throws Exception {
//        EmployeeController ec = new EmployeeController();
        // test get
//        Employee e = new Employee();
//        e = ec.getEmployee(7369);
//        System.out.println(e);

        // test add
        // 1. failed: java.util.Date and sql.Date are not the same
        // 2. failed: Can not issue data manipulation with executeQuery(), to manipulate, use executeUpdate()

//        java.sql.Date date = java.sql.Date.valueOf("2021-05-01");
//        Employee e = new Employee("LONG", "PROGRAM", 8000, 7839, 10, date, 5000.0);
//        ec.addEmployee(e);
//        System.out.println("New Employee added");

        // test update
//        java.sql.Date date = java.sql.Date.valueOf("2021-05-01");
//        Employee e = new Employee("LONG", "PROGRAM", 8000, 7839, 10, date, 5000.0);
//        e.setSalary(10000.0);
//        e.setDeptid(90);
//        ec.updateEmployee(8000, e);
//        System.out.println("Employee has been updated");

        // test delete
//        ec.deleteEmployee(8000);

        // -----------------------DEPARTMENT
        // test read
//        DepartmentController dc = new DepartmentController();
//        Department d = dc.getDepartment(10);
//        System.out.println(d);

        // test add
//        Department d = new Department(60, "宣传", "DC");
//        dc.addDepartment(d);
//        System.out.println("Department added");

        // test update
//        d.setName("组织");
//        dc.updateDepartment(60, d);
//        System.out.println("Department updated");

        // test delete
//        dc.deleteDepartment(60);
//        System.out.println("Department deleted");

        /*
        EmployeeController ec = new EmployeeController();
        for (Employee employee : EmployeeDAO.employees) {
            ec.addEmployee(employee);
        }
        System.out.println("Employees added!");

        Employee e = EmployeeDAO.employees.get(0);
        e.setSalary(3000.0);
        ec.updateEmployee(e.getEmpid(), e);
        System.out.println("Employees updated!");

        for (int i = 8000; i < 8005; i++) {
            ec.deleteEmployee(i);
        }
        System.out.println("Employees deleted!");

        System.out.println("Getting employee 7989");
        System.out.println(ec.getEmployee(7989));


        DepartmentController dc = new DepartmentController();
        DepartmentDAO.departments.forEach(department -> {
            try {
                dc.addDepartment(department);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        System.out.println("Departments added!");

        Department d = DepartmentDAO.departments.get(0);
        d.setLoc("China");
        dc.updateDepartment(d.getDeptid(), d);
        System.out.println("Department updated");

        for (int i = 60; i < 63; i++) {
            dc.deleteDepartment(i);
        }
        System.out.println("Department deleted");

        System.out.println("Getting department 10");
        System.out.println(dc.getDepartment(10));
         */


        SpringApplication.run(MvcHwApplication.class, args);
    }

}


/*
{
    "deptid": 60,
    "name": "组织",
    "loc": "DC"
}

{
    "empid": 8000,
    "name": "关羽",
    "job": "前将军",
    "manager": 7989,
    "hiredate": "2021-05-01",
    "salary": 5000.0,
    "deptid": 10
}



 */

package com.example.mvchw;

import java.sql.Date;

public class Employee {

    private String name, job;
    private Integer empid, manager, deptid;
    private Date hiredate;
    private Double salary;

    public Employee(){}
    public Employee(String name, String job, Integer empid, Integer manager, Integer deptid, Date hiredate, Double salary) {
        this.name = name;
        this.job = job;
        this.empid = empid;
        this.manager = manager;
        this.deptid = deptid;
        this.hiredate = hiredate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", empid=" + empid +
                ", manager=" + manager +
                ", deptid=" + deptid +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                '}';
    }
}

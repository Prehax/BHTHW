package com.example.mvchw;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class EmployeeService {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/course";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Bmz!f546m3";

    public Employee getEmployeeById(int id) throws Exception{
        Employee employee = null;

        Connection conn = null;
//        Statement stmt = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

//            String sql = "SELECT * FROM employee WHERE job = '" + job + "'";
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery(sql);

            String sql = "SELECT * FROM employee WHERE empid = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while(rs.next()) {
                employee = new Employee(rs.getString("name"),
                        rs.getString("job"),
                        rs.getInt("empid"),
                        rs.getInt("manager"),
                        rs.getInt("deptid"),
                        rs.getDate("hiredate"),
                        rs.getDouble("salary"));
            }
            rs.close();
            stmt.close();
            conn.close();
            return employee;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public void addEmployee(@org.jetbrains.annotations.NotNull Employee employee) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql = "INSERT INTO employee(empid, name, job, manager, hiredate, salary, deptid) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, employee.getEmpid());
            stmt.setString(2, employee.getName());
            stmt.setString(3, employee.getJob());
            stmt.setInt(4, employee.getManager());
            stmt.setDate(5, employee.getHiredate());
            stmt.setDouble(6, employee.getSalary());
            stmt.setInt(7, employee.getDeptid());
            rs = stmt.executeUpdate();

//            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void deleteEmployee(int id) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql = "DELETE FROM employee where empid = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void updateEmployee(int id, Employee employee) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "UPDATE employee SET name = ?, job = ?, manager = ?, salary = ?, deptid = ?  WHERE empid = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getJob());
            stmt.setInt(3, employee.getManager());
            stmt.setDouble(4, employee.getSalary());
            stmt.setInt(5, employee.getDeptid());
            stmt.setInt(6, id);

            rs = stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}

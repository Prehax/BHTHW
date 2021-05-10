package com.example.mvchw;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class DepartmentService {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/course";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Bmz!f546m3";

    public void addDepartment(Department department) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql = "INSERT INTO department(deptid, name, loc) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, department.getDeptid());
            stmt.setString(2, department.getName());
            stmt.setString(3, department.getLoc());

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

    public void deleteDepartment(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql = "DELETE FROM department WHERE deptid = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            rs = stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        } finally {
            if (stmt!=null) {
                stmt.close();
            }
            if (conn!=null) {
                conn.close();
            }
        }
    }

    public void updateDepartment(int id, Department department) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "UPDATE department SET name = ?, loc = ? WHERE deptid = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, department.getName());
            stmt.setString(2, department.getLoc());
            stmt.setInt(3, id);

            rs = stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
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

    public Department getDepartmentById(int id) {
        Department department = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String sql = "SELECT * FROM department WHERE deptid = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()) {
                department = new Department(rs.getInt("deptid"),
                        rs.getString("name"),
                        rs.getString("loc"));
            }

            rs.close();
            stmt.close();
            conn.close();

            return department;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}

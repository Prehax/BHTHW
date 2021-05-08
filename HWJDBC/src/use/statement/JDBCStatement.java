package use.statement;

import java.sql.*;
import java.util.*;
//import com.mysql.jdbc.Driver;
import com.mysql.cj.jdbc.Driver;

public class JDBCStatement {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/course";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Bmz!f546m3";

    public List<Employee> getEmployeeByJob(String job) throws Exception{
        Employee employee;
        List<Employee> emps = new ArrayList<>();

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

            String sql = "SELECT * FROM employee WHERE job = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, job);
            rs = stmt.executeQuery();

            while(rs.next()) {
                employee = new Employee(rs.getString("name"),
                        rs.getString("job"),
                        rs.getInt("empid"),
                        rs.getInt("manager"),
                        rs.getInt("deptid"),
                        rs.getDate("hiredate"),
                        rs.getDouble("salary"));
                emps.add(employee);
            }
            rs.close();
            stmt.close();
            conn.close();
            return emps;

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
}

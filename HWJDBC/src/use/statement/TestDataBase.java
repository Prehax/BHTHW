package use.statement;

import java.util.*;

public class TestDataBase {
    public static void main(String[] args) throws Exception {
        JDBCStatement s = new JDBCStatement();
        List<Employee> emps = s.getEmployeeByJob("MANAGER");
        for (Employee e:
             emps) {
            System.out.println(e);
        }
    }
}

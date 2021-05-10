package com.example.mvchw;

import java.util.*;

public class DepartmentDAO {
    public static List<Department> departments;
    static {
        departments = new ArrayList<>();

        departments.add(new Department(60, "宣传", "DC"));
        departments.add(new Department(61, "组织", "DC"));
        departments.add(new Department(62, "打仗", "DC"));
    }

}

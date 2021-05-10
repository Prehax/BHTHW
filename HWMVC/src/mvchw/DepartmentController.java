package com.example.mvchw;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @GetMapping(value = "/{deptId}/load")
    public Department getDepartment(@PathVariable("deptId") int deptId) throws Exception {
        DepartmentService ds = new DepartmentService();
        return ds.getDepartmentById(deptId);
    }

    @PostMapping(value = "/add")
    public boolean addDepartment(@RequestBody Department d) throws Exception {
        DepartmentService ds = new DepartmentService();
        try {
            ds.addDepartment(d);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @DeleteMapping(value = "/{deptId}/delete")
    public boolean deleteDepartment(@PathVariable("deptId") int deptId) throws Exception {
        DepartmentService ds = new DepartmentService();
        try {
            ds.deleteDepartment(deptId);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @PutMapping(value = "/{deptId}/update")
    public boolean updateDepartment(@PathVariable("deptId") int deptId, @RequestBody Department d) throws Exception {
        DepartmentService ds = new DepartmentService();
        try {
            ds.updateDepartment(deptId, d);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

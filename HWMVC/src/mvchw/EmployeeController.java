package com.example.mvchw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value = "/employee")
public class EmployeeController {
    @RequestMapping(value = "/{userId}/load", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("userId") int id) throws Exception {
        EmployeeService es = new EmployeeService();
        return es.getEmployeeById(id);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public boolean addEmployee(@RequestBody Employee e) throws Exception {
        EmployeeService es = new EmployeeService();
        try {
            es.addEmployee(e);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @RequestMapping(value = "/{userId}/delete", method = RequestMethod.DELETE)
    public boolean deleteEmployee(@PathVariable("userId") int userId) throws Exception {
        EmployeeService es = new EmployeeService();
        try {
            es.deleteEmployee(userId);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @RequestMapping(value = "/{userId}/update", method = RequestMethod.PUT)
    public boolean updateEmployee(@PathVariable("userId") int userId, @RequestBody Employee employee) throws Exception {
        EmployeeService es = new EmployeeService();
        try {
            es.updateEmployee(userId, employee);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

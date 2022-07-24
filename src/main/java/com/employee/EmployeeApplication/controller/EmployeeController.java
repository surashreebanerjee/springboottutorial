package com.employee.EmployeeApplication.controller;

import com.employee.EmployeeApplication.entity.Employee;
import com.employee.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
////@ResponseBody
//@Controller
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/employees")
    public List<Employee> getAllemployeees()
    {
        return employeeService.getAllemployees();
    }
    @RequestMapping("/employees/{id}")
    public Employee getAnemployee(@PathVariable int id)
    {
       return employeeService.getAnemployee(id);
    }
    @RequestMapping(value = "/employees",method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }
@RequestMapping(value="employees/{id}",method =RequestMethod.PUT)
public void updateEmployee(@RequestBody Employee emp,@PathVariable int id)
{
    employeeService.updateEmployee(emp);
}
@RequestMapping(value="/employees/{id}",method =RequestMethod.DELETE)
public void deleteEmployee(@PathVariable int id)
{
    employeeService.deleteEmployee(id);
}
}

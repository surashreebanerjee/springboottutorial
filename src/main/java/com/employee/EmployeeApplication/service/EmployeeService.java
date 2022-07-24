package com.employee.EmployeeApplication.service;

import com.employee.EmployeeApplication.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employees= new ArrayList<>(Arrays.asList(new Employee(1,"First Employee","Washington"),
            new Employee(2,"second Employee","New York")));
    public List<Employee> getAllemployees()
    {
        return employees;
    }
    public Employee getAnemployee(int id)
    {
        Employee emp = null;
        for(Employee e:employees)
        {
            if(e.getEmployeeId()==id)
            {
               emp= e;
            }
        }
        return emp;
    }
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    public void updateEmployee(Employee employee)
    {
        for(Employee e:employees)
        {
            if(e.getEmployeeId()==employee.getEmployeeId())
            {
                e.setEmployeeName(employee.getEmployeeName());
                e.setEmployeeCity(employee.getEmployeeCity());
            }
        }
    }
    public void deleteEmployee(int id)
    {
        for (Employee emp:employees)
        {
            if(emp.getEmployeeId()==id)
            {
                employees.remove(emp);
                break;
            }
        }
    }

}

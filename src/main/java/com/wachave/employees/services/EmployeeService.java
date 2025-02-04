package com.wachave.employees.services;

import com.wachave.employees.entities.Employee;

import java.util.List;

public interface EmployeeService {

    //get a list of employee
    List<Employee> findAll();

    //get an employee
    Employee findById(int employeeId);

    //save an employee
    Employee saveEmployee(Employee employee);

    //delete an employee
    void deleteById(int employeeId);
}

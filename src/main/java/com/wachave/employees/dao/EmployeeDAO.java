package com.wachave.employees.dao;

import com.wachave.employees.entities.Employee;

import java.util.List;

public interface EmployeeDAO {

    //get list of all employee
    List<Employee> findAll();

    //get an employee
    Employee findById(int employeeId);

    //save an employee
    Employee saveEmployee(Employee employee);

    //delete an employee
    void deleteById(int employeeId);

}

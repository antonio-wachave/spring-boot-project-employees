package com.wachave.employees.services;

import com.wachave.employees.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}

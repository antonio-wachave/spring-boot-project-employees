package com.wachave.employees.dao;

import com.wachave.employees.entities.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}

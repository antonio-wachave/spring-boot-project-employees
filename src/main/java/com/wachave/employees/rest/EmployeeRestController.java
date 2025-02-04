package com.wachave.employees.rest;

import com.wachave.employees.dao.EmployeeDAO;
import com.wachave.employees.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeRestController( EmployeeDAO theemployeeDAO){
        this.employeeDAO = theemployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){

        return this.employeeDAO.findAll();
    }
}

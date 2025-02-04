package com.wachave.employees.rest;

import com.wachave.employees.entities.Employee;
import com.wachave.employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController( EmployeeService theemployeeService){
        this.employeeService = theemployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){

        return this.employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){

        Employee theEmployee = this.employeeService.findById(employeeId);

        if(theEmployee == null){
            throw new RuntimeException(" Employee id not found - "+employeeId);
        }

        return theEmployee;
    }
}

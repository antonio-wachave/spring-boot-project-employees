package com.wachave.employees.services;

import com.wachave.employees.dao.EmployeeDAO;
import com.wachave.employees.entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        this.employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    public Employee findById(int employeeId) {
        return this.employeeDAO.findById(employeeId);
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteById(int employeeId) {
        this.employeeDAO.deleteById(employeeId);
    }
}

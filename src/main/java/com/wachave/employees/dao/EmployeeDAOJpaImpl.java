package com.wachave.employees.dao;

import com.wachave.employees.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;


    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll(){

        //create a query
        TypedQuery<Employee> theQuery = this.entityManager.createQuery("from Employee", Employee.class);

         List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int employeeId) {

        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        return theEmployee;
    }

    @Override
    public Employee saveEmployee(Employee theEmployee) {

        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int employeeId) {

        //find byId
        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        //remove the id
        entityManager.remove(theEmployee);

    }

}

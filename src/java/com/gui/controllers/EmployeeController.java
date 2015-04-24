package com.gui.controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.EmployeeService;
import com.jpa.entities.Employee;
import javax.annotation.PostConstruct;

@ManagedBean (name="employeeController")
public class EmployeeController {

    private Employee employee;

    @EJB
    private EmployeeService service;
    
    @PostConstruct
    public void init(){
        employee = new Employee();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void saveEmployee(Employee emp) {
        service.addEmployee(emp);
    }

}

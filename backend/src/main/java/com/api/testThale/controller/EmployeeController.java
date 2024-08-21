package com.api.testThale.controller;

import com.api.testThale.model.Employee;
import com.api.testThale.service.EmployeeService;
import com.api.testThale.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final SalaryService salaryService;

    @Autowired
    public EmployeeController(EmployeeService employeeService, SalaryService salaryService) {
        this.employeeService = employeeService;
        this.salaryService = salaryService;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees().getData();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        // Employee employee = employeeService.getEmployeeById(id).getData();
        Employee employee = employeeService.getEmployeeById(id);
        double annualSalary = salaryService.calculateAnnualSalary(employee);
        employee.setAnnualSalary(annualSalary);
        return employee;
    }
}

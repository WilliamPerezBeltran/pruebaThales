package com.api.testThale.service;

import com.api.testThale.model.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryServiceTest {

    private final SalaryService salaryService = new SalaryService();

    @Test
    public void testCalculateAnnualSalary() {
        Employee employee = new Employee();
        employee.setEmployee_salary(5000);

        double annualSalary = salaryService.calculateAnnualSalary(employee);

        assertEquals(60000, annualSalary);
    }
}

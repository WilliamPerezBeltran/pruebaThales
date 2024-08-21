package com.api.testThale.service;

import com.api.testThale.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public double calculateAnnualSalary(Employee employee) {
        return employee.getEmployee_salary() * 12;
    }
}

package com.api.testThale.service;

import com.api.testThale.model.Employee;
import com.api.testThale.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    private final RestTemplate restTemplate;

    @Autowired
    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public EmployeeResponse getAllEmployees() {
        String url = "http://dummy.restapiexample.com/api/v1/employees";
        return restTemplate.getForObject(url, EmployeeResponse.class);
    }

    public Employee getEmployeeById(int id) {
        String url = "http://dummy.restapiexample.com/api/v1/employee/" + id;
        return restTemplate.getForObject(url, Employee.class);
    }
}

package com.api.testThale.service;

import com.api.testThale.model.Employee;
import com.api.testThale.model.EmployeeListResponse;
import com.api.testThale.model.EmployeeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {

    private final RestTemplate restTemplate;

    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // public EmployeeResponse getEmployeeById(int id) {
    //     String url = "http://dummy.restapiexample.com/api/v1/employee/" + id;
    //     return restTemplate.getForObject(url, EmployeeResponse.class);
    // }

    public Employee getEmployeeById(int id) {
         String url = "http://dummy.restapiexample.com/api/v1/employee/" + id;
        EmployeeResponse response = restTemplate.getForObject(url, EmployeeResponse.class);
        return response != null ? response.getData() : null;
    }


    public EmployeeListResponse getAllEmployees() {
        String url = "http://dummy.restapiexample.com/api/v1/employees";
        return restTemplate.getForObject(url, EmployeeListResponse.class);
    }
}

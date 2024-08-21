package com.api.testThale.service;

import com.api.testThale.model.Employee;
import com.api.testThale.model.EmployeeResponse;

import com.api.testThale.model.EmployeeListResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class EmployeeServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private EmployeeService employeeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllEmployees() {

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setEmployee_name("John Doe");
        employee1.setEmployee_salary(5000);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setEmployee_name("Jane Doe");
        employee2.setEmployee_salary(6000);

        EmployeeListResponse mockResponse = new EmployeeListResponse();
        mockResponse.setData(List.of(employee1, employee2));

        when(restTemplate.getForObject(anyString(), eq(EmployeeListResponse.class)))
                .thenReturn(mockResponse);

        EmployeeListResponse response = employeeService.getAllEmployees();

        assertEquals(2, response.getData().size());
        assertEquals("John Doe", response.getData().get(0).getEmployee_name());
        assertEquals(5000, response.getData().get(0).getEmployee_salary());
        assertEquals("Jane Doe", response.getData().get(1).getEmployee_name());
        assertEquals(6000, response.getData().get(1).getEmployee_salary());
    }

    @Test
    public void testGetEmployeeById() {
        EmployeeResponse mockResponse = new EmployeeResponse();
        Employee mockEmployee = new Employee();
        mockEmployee.setId(1);
        mockResponse.setData(mockEmployee);

        when(restTemplate.getForObject(anyString(), eq(EmployeeResponse.class))).thenReturn(mockResponse);

        Employee employee = employeeService.getEmployeeById(1);

        assertEquals(mockEmployee.getId(), employee.getId());
    }
}

package com.api.testThale.model;

import java.util.List;

public class EmployeeResponse {
    private List<Employee> data;

    public List<Employee> getData() {
        return data;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }
}

package com.example.mad_backend.service;

import java.util.List;

import com.example.mad_backend.model.Employee;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee deleteEmployee(Integer employeeId);
    public Employee getDetailEmployee(Integer employeeId);
    public Employee updateEmployee(Employee employee);
     
}

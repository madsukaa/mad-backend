package com.example.mad_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mad_backend.model.Employee;
import com.example.mad_backend.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
        return null;
    }

    @Override
    public Employee getDetailEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    

    
}

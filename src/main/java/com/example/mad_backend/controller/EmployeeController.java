package com.example.mad_backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mad_backend.model.Employee;
import com.example.mad_backend.service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return "New employee has added";
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public Employee getDetailEmployee(@PathVariable("employeeId") Integer employeeId) {
        return employeeService.getDetailEmployee(employeeId);
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @PatchMapping("/{employeeId}")
    public Employee patchEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{employeeId}")
    public Employee deleteEmployee(@PathVariable("employeeId") Integer employeeId){
        return employeeService.deleteEmployee(employeeId);
    }
    
}

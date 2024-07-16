package com.example.mad_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mad_backend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}

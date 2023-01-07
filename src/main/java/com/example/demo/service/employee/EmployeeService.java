package com.example.demo.service.employee;

import com.example.demo.entity.employee.Employee;

import java.util.List;
import java.util.Optional;


interface EmployeeService {

    List<Employee> getAllEmployees();

    Optional<Employee> findById(Long id);

   Employee saveEmployee(Employee employee);
}

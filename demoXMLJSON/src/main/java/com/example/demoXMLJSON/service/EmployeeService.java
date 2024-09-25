package com.example.demoXMLJSON.service;

import com.example.demoXMLJSON.model.Employee;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private Map<Long, Employee> employeeRepository = new HashMap<>();

    // Initialize with one employee for demo purposes
    public EmployeeService() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("John Doe");
        employee.setDepartment("Engineering");
        employeeRepository.put(1L, employee);
    }

    // Get employee by ID
    public Employee getEmployeeById(Long id) {
        return employeeRepository.get(id);
    }

    // Add a new employee
    public void addEmployee(Employee employee) {
        employeeRepository.put(employee.getId(), employee);
    }
}

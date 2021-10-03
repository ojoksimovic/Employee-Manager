package tech.olivera.employeemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.olivera.employeemanager.exception.UserNotFoundException;
import tech.olivera.employeemanager.model.Employee;
import tech.olivera.employeemanager.repo.EmployeeRepo;


@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeebyId(Long id){
        return employeeRepo.findEmployeeById(id)
        .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
 
    // query method
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}

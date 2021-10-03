package tech.olivera.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.olivera.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    
}

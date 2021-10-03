package tech.olivera.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.olivera.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    // query methods
    // naming convention -> delete from model (Employee) by field (id)

    void deleteEmployeeById(Long id);

    Optional <Employee> findEmployeeById(Long id);
}

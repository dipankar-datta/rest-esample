package com.dipankar.rest_example.data.repositories;

import com.dipankar.rest_example.data.entities.Employee;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<Employee, Long> {
}

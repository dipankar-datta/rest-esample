package com.dipankar.rest_example.data.repositories;

import com.dipankar.rest_example.data.entities.Department;
import org.springframework.data.repository.ListCrudRepository;

@org.springframework.stereotype.Repository
public interface DepartmentRepository extends ListCrudRepository<Department, Long> {
}

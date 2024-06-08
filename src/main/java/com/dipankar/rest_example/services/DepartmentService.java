package com.dipankar.rest_example.services;

import com.dipankar.rest_example.data.entities.Department;
import com.dipankar.rest_example.data.repositories.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> findDepartment(Long id) {
        return departmentRepository.findById(id);
    }

}

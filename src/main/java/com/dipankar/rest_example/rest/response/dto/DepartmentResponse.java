package com.dipankar.rest_example.rest.response.dto;

import com.dipankar.rest_example.data.entities.Department;
import com.dipankar.rest_example.data.entities.Employee;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentResponse {

    private Long id;

    private String name;

    private String description;

    private EmployeDetailsLimited headOfDepartment;

    public static DepartmentResponse toResponse(Department department) {
        return DepartmentResponse.builder()
                .id(department.getId())
                .name(department.getName())
                .description(department.getDescription())
                .headOfDepartment(
                        EmployeDetailsLimited.builder()
                                .id(department.getHeadOfDepartment().getId())
                                .firstName(department.getHeadOfDepartment().getFirstName())
                                .lastName(department.getHeadOfDepartment().getLastName()).build())
                .build();
    }
}

package com.dipankar.rest_example.rest.response.dto;

import com.dipankar.rest_example.data.entities.*;
import com.dipankar.rest_example.util.CommonUtil;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static com.dipankar.rest_example.util.CommonUtil.nullSafeList;
import static java.util.stream.Collectors.toList;

@Data
@Builder
public class EmployeeResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private LocalDate dateOfBirth;

    private String email;

    private List<ContactNumberResponse> contactNumbers;

    private DepartmentResponse department;

    private List<RoleResponse> roles;

    private List<EmployeDetailsLimited> reporters;

    public static EmployeeResponse toResponse(Employee employee) {
        return EmployeeResponse.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .address(employee.getAddress())
                .email(employee.getEmail())
                .contactNumbers(
                        nullSafeList(employee.getContactNumbers()).stream()
                                .map(ContactNumberResponse::toResponse).collect(toList()))
                .department(DepartmentResponse.toResponse(employee.getDepartment()))
                .roles(nullSafeList(employee.getRoles()).stream()
                        .map(RoleResponse::toResponse).collect(toList()))
                .reporters(
                        nullSafeList(
                                employee.getReporters())
                                .stream().map(
                                        reporter -> EmployeDetailsLimited.builder()
                                                .id(reporter.getId())
                                                .firstName(reporter.getFirstName())
                                                .lastName(reporter.getLastName()).build())
                                .collect(toList()))
                .build();
    }
}

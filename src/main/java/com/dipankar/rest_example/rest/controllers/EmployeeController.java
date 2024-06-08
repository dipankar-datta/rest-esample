package com.dipankar.rest_example.rest.controllers;

import com.dipankar.rest_example.rest.response.dto.EmployeeResponse;
import com.dipankar.rest_example.services.EmployeeService;
import com.dipankar.rest_example.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static com.dipankar.rest_example.rest.response.dto.EmployeeResponse.toResponse;
import static com.dipankar.rest_example.util.CommonUtil.handleNoData;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeResponse> findAllEmployees() {
        return handleNoData(
                employeeService.findAllEmployees()).stream()
                .map(EmployeeResponse::toResponse)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public EmployeeResponse findEmployeeById(@PathVariable Long id) {
        return toResponse(handleNoData(employeeService.findEmployeeById(id)).get());
    }
}

package com.dipankar.rest_example.rest.controllers;

import com.dipankar.rest_example.rest.response.dto.DepartmentResponse;
import com.dipankar.rest_example.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static com.dipankar.rest_example.util.CommonUtil.nullSafeList;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public List<DepartmentResponse> getAlDepartments() {

        return nullSafeList(departmentService.getAllDepartments()).stream()
                .map(DepartmentResponse::toResponse).collect(Collectors.toUnmodifiableList());
    }
}

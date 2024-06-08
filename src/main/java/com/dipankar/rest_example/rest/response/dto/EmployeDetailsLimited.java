package com.dipankar.rest_example.rest.response.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeDetailsLimited {

    private Long id;

    private String firstName;

    private String lastName;
}

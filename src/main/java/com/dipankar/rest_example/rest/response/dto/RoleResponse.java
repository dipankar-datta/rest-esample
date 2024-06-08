package com.dipankar.rest_example.rest.response.dto;

import com.dipankar.rest_example.data.entities.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleResponse {

    private Long id;

    private String name;

    private String description;

    public static RoleResponse toResponse(Role role) {
        return RoleResponse.builder()
                .id(role.getId())
                .name(role.getName())
                .description(role.getDescription())
                .build();
    }
}

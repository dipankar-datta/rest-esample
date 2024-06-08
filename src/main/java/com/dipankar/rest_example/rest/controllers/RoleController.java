package com.dipankar.rest_example.rest.controllers;

import com.dipankar.rest_example.data.entities.Role;
import com.dipankar.rest_example.rest.response.dto.RoleResponse;
import com.dipankar.rest_example.services.RoleService;
import com.dipankar.rest_example.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.dipankar.rest_example.rest.response.dto.RoleResponse.toResponse;
import static com.dipankar.rest_example.util.CommonUtil.handleNoData;
import static com.dipankar.rest_example.util.CommonUtil.nullSafeList;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping
    public List<RoleResponse> getAllRoles() {
        return handleNoData(roleService.getAllRoles()).stream()
                .map(RoleResponse::toResponse).collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public RoleResponse findRoleById(@PathVariable Long id) {
        Optional<Role> role = roleService.findRoleById(id);
        return toResponse(handleNoData(role).get()) ;
    }

}

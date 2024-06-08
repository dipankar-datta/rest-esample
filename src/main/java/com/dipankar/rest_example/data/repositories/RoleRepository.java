package com.dipankar.rest_example.data.repositories;

import com.dipankar.rest_example.data.entities.Role;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends ListCrudRepository<Role, Long> {

}

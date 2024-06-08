package com.dipankar.rest_example.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "employee")
    private List<ContactNumber> contactNumbers;

    @OneToOne(mappedBy = "employee")
    private Login login;

    @JoinColumn(name = "department_id", referencedColumnName = "id")
    @OneToOne
    private Department department;

    @JoinTable(
            name = "employee_role_map",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @OneToMany
    private List<Role> roles;

    @JoinColumn(name = "line_manager", referencedColumnName = "id")
    @OneToMany
    private List<Employee> reporters;
}

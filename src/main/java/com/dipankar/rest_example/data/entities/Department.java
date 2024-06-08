package com.dipankar.rest_example.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "department")
public class Department implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

//    @Column(name = "head_of_department")
    @JoinColumn(name = "head_of_department", referencedColumnName = "id")
    private Employee headOfDepartment;
}

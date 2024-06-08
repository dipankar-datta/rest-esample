package com.dipankar.rest_example.data.entities;

import com.dipankar.rest_example.data.converters.BooleanConverter;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "login")
public class Login implements Serializable {

    @Id
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    @OneToOne
    private Employee employee;

    @Column(name = "password")
    private String password;

    @Convert(converter = BooleanConverter.class)
    @Column(name = "is_active")
    private Boolean isActive;
}

package com.dipankar.rest_example.data.entities;

import com.dipankar.rest_example.data.converters.BooleanConverter;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "contact_number")
public class ContactNumber implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Convert(converter = BooleanConverter.class)
    @Column(name = "is_primary")
    private Boolean isPrimary;

    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
}

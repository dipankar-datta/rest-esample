package com.dipankar.rest_example.rest.response.dto;

import com.dipankar.rest_example.data.entities.ContactNumber;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactNumberResponse {

    private Long id;

    private String countryCode;

    private String phoneNumber;

    public static ContactNumberResponse toResponse(ContactNumber contactNumber) {
        return ContactNumberResponse.builder()
                .id(contactNumber.getId())
                .countryCode(contactNumber.getCountryCode())
                .phoneNumber(contactNumber.getPhoneNumber())
                .build();
    }
}

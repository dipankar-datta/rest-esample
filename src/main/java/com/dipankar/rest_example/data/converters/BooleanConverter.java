package com.dipankar.rest_example.data.converters;

import jakarta.persistence.AttributeConverter;

public class BooleanConverter implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean bool) {
        return bool != null && bool ? "true" : "false";
    }

    @Override
    public Boolean convertToEntityAttribute(String strBoolean) {
        return "true".equals(strBoolean);
    }
}

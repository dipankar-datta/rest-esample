package com.dipankar.rest_example.util;

import com.dipankar.rest_example.exceptions.NoDataFoundException;

import java.util.*;

public class CommonUtil {

    public static <T> List<T> nullSafeList(List<T> data) {
        return data == null ? new ArrayList() : data;
    }

    public static <T> T handleNoData(T data) {
        if (data == null
                || (data instanceof Collection<?> && ((Collection<?>) data).isEmpty())
                || (data instanceof Optional<?> && ((Optional<?>) data).isEmpty())) {
            throw new NoDataFoundException("No data found");
        }
        return data;
    }
}

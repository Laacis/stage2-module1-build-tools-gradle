package com.epam.utils;

import  static org.apache.commons.lang3.math.NumberUtils.isParsable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return isParsable(str) && Double.parseDouble(str) > 0;
    }
}

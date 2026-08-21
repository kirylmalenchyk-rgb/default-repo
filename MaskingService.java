package com.example;

public class MaskingService {
    public String maskPan(String value) {
        if (value == null || value.length() < 4) {
            return "****";
        }
        return "XXXXXX" + value.substring(value.length() - 4);
    }
}

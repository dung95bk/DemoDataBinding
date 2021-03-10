package com.example.databindingdemo;

import androidx.databinding.InverseMethod;

public class InverseMethodConv {
    @InverseMethod("convertIntToString")
    public static int convertStringToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static String convertIntToString(int value) {
        return String.valueOf(value);
    }
}

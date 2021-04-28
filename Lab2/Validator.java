package com.java.Exceptions;

public class Validator {
    public static void noNumber(String str) throws InputStringException {
        String temp = "1234567890";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < temp.length(); j++) {
                if (str.charAt(i) == temp.charAt(j)) {
                    throw new InputStringException("Назва не повинна містити цифр");
                }
            }
        }
    }

    public static void lessThanZero(int a) throws InputIntException {
        if (a < 0) {
            throw new InputIntException("Вік не повинен бути < 0");
        }
    }
}

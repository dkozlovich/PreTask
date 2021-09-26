package service;

import entity.CustomNumber;

public class CustomNumberMathService {

    public static CustomNumber add(CustomNumber ... customNumbers) throws IllegalArgumentException {
        validateArguments(customNumbers);
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f + customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }

    public static CustomNumber subtract(CustomNumber ... customNumbers) throws IllegalArgumentException {
        validateArguments(customNumbers);
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f - customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }

    public static CustomNumber divide(CustomNumber ... customNumbers) throws IllegalArgumentException {
        validateArguments(customNumbers);
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            if (customNumbers[i].getNumber() == 0) {
                throw new IllegalArgumentException();
            }
            f = f / customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }

    public static CustomNumber multiply(CustomNumber ... customNumbers) throws IllegalArgumentException {
        validateArguments(customNumbers);
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f * customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }

    private static void validateArguments(CustomNumber ... customNumbers) throws IllegalArgumentException {
        for (CustomNumber customNumber : customNumbers) {
            if (customNumber == null) {
                throw new IllegalArgumentException();
            }
        }
    }
}

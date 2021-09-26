package service;

import entity.CustomNumber;

public class CustomNumberMathService {
    public static CustomNumber add(CustomNumber ... customNumbers) {
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f + customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }
    public static CustomNumber subtract(CustomNumber ... customNumbers) {
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f - customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }
    public static CustomNumber divide(CustomNumber ... customNumbers) {
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f / customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }
    public static CustomNumber multiply(CustomNumber ... customNumbers) {
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f * customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }
}

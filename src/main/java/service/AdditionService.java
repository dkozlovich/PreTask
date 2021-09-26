package service;

import entity.CustomNumber;

public class AdditionService {
    public static CustomNumber calculate(CustomNumber ... customNumbers) {
        float f = customNumbers[0].getNumber();
        for (int i = 1; i < customNumbers.length; i++) {
            f = f + customNumbers[i].getNumber();
        }
        return new CustomNumber(f);
    }
}

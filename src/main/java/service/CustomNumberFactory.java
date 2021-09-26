package service;

import entity.CustomNumber;

public class CustomNumberFactory {
    public static CustomNumber parseFromString(String str) throws CustomNumberParsingException {
        try {
            return new CustomNumber(Float.parseFloat(str));
        } catch (NumberFormatException e) {
            throw new CustomNumberParsingException();
        }
    }

}

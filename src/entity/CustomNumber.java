package entity;

import service.AdditionService;
import service.CustomNumberParsingException;
import service.ReadFromFile;

import java.io.IOException;
import java.util.List;

public class CustomNumber {
    private float number;

    public CustomNumber(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public static void main(String[] args) throws IOException, CustomNumberParsingException {
        ReadFromFile readFromFile = new ReadFromFile();
        List<CustomNumber> list;
        list = readFromFile.read();
        System.out.println(AdditionService.calculate(list.get(0), list.get(1)).getNumber());
    }
}

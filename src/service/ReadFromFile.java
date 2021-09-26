package service;

import entity.CustomNumber;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    public List<CustomNumber> read() throws CustomNumberParsingException, IOException {
        List<CustomNumber> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("c:/numbers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                for (String str : strings) {
                    CustomNumber customNumber = CustomNumberFactory.parseFromString(str);
                    list.add(customNumber);
                }
            }
        } catch (CustomNumberParsingException e) {

        }
        return list;
    }
}

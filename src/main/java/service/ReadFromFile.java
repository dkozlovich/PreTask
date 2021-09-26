package service;

import entity.CustomNumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    private static final Logger logger = LogManager.getLogger();

    public List<CustomNumber> read(File file) throws IOException {
        logger.info(file.getPath());
        List<CustomNumber> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                for (String str : strings) {
                    CustomNumber customNumber = CustomNumberFactory.parseFromString(str);
                    list.add(customNumber);
                }
            }
        } catch (CustomNumberParsingException e) {
            logger.error("An exception was thrown during parsing " + e.getMessage());
        }
        return list;
    }
}

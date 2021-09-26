package service;

import entity.CustomNumber;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileTest {

    @Test
    public void testRead() throws IOException, CustomNumberParsingException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("numbers.txt").getFile());
        List<CustomNumber> result = new ReadFromFile().read(file);
        List<CustomNumber> expected = new ArrayList<>();
        expected.add(new CustomNumber(10));
        expected.add(new CustomNumber(20));
        expected.add(new CustomNumber(30));
        expected.add(new CustomNumber(50));
        Assert.assertEquals(expected, result);
    }

    @Test(expected = CustomNumberParsingException.class)
    public void testCustomNumberParsingException() throws IOException, CustomNumberParsingException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("numbersWrong.txt").getFile());
        new ReadFromFile().read(file);
    }
}

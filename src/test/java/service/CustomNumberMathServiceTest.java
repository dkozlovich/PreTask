package service;

import entity.CustomNumber;
import org.junit.Assert;
import org.junit.Test;

public class CustomNumberMathServiceTest {
    @Test
    public void testAdd() {
        CustomNumber cn1 = new CustomNumber(10);
        CustomNumber cn2 = new CustomNumber(20);
        CustomNumber cn3 = new CustomNumber(30);
        CustomNumber res = new CustomNumber(60);
        CustomNumber f = CustomNumberMathService.add(cn1, cn2, cn3);
        Assert.assertEquals(res,f);
    }
    @Test
    public void testSubtract() {
        CustomNumber cn1 = new CustomNumber(10);
        CustomNumber cn2 = new CustomNumber(20);
        CustomNumber cn3 = new CustomNumber(30);
        CustomNumber res = new CustomNumber(-40);
        CustomNumber f = CustomNumberMathService.subtract(cn1, cn2, cn3);
        Assert.assertEquals(res,f);
    }
    @Test
    public void testDivide() {
        CustomNumber cn1 = new CustomNumber(50);
        CustomNumber cn2 = new CustomNumber(5);
        CustomNumber cn3 = new CustomNumber(2);
        CustomNumber res = new CustomNumber(5);
        CustomNumber f = CustomNumberMathService.divide(cn1, cn2, cn3);
        Assert.assertEquals(res,f);
    }
    @Test
    public void testMultiply() {
        CustomNumber cn1 = new CustomNumber(5);
        CustomNumber cn2 = new CustomNumber(3);
        CustomNumber cn3 = new CustomNumber(100);
        CustomNumber res = new CustomNumber(1500);
        CustomNumber f = CustomNumberMathService.multiply(cn1, cn2, cn3);
        Assert.assertEquals(res,f);

    }
}

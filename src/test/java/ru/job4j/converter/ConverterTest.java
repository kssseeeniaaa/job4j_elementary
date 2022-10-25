package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConverter140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter180RblThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float esp = 0.0001f;
        Assert.assertEquals(expected, out, esp);
    }
}
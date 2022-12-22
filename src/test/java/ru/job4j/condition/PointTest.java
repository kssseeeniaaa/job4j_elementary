package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when52to35Then3dot6() {
        double expected = 3.6;
        Point a = new Point(5, 2);
        Point b = new Point(3, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when17to29Then2dot23() {
        double expected = 2.23;
        Point a = new Point(1, 7);
        Point b = new Point(2, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when91to24Then7dot61() {
        double expected = 7.61;
        Point a = new Point(9, 1);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
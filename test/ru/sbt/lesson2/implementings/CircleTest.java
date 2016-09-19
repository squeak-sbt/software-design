package ru.sbt.lesson2.implementings;


import static org.junit.Assert.*;

public class CircleTest {
    private static final Circle circle = new Circle(2.0);
    @org.junit.Test
    public void calculateSquare() throws Exception {
        assertEquals(12.56, circle.calculateSquare(), 0.1);
    }

    @org.junit.Test
    public void calculatePerimetr() throws Exception {
        assertEquals(12.56, circle.calculatePerimeter(), 0.1);
    }

}
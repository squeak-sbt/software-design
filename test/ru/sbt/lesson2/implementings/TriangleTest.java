package ru.sbt.lesson2.implementings;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private static final Triangle triangle = new Triangle(1.0, 1.0, 1.0);

    @Test
    public void calculateSquare() throws Exception {
        assertEquals(Math.sqrt(3) / 4.0, triangle.calculateSquare(), 0.1);
    }

    @Test
    public void calculatePerimetr() throws Exception {
        assertEquals(3.0, triangle.calculatePerimeter(), 0.1);
    }

}
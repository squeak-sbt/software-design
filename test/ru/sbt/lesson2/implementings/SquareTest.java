package ru.sbt.lesson2.implementings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private static final Square square = new Square(1.0);
    @Test
    public void calculateSquare() throws Exception {
        assertEquals(square.calculateSquare(), 1.0, 0.1);
    }

    @Test
    public void calculatePerimetr() throws Exception {
        assertEquals(square.calculatePerimetr(), 4.0, 0.1);
    }

}
package ru.sbt.lesson2.implementings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    double n = 5;

    Circle item = new Circle(n);
    @Test
    public void calculateSquare() throws Exception {
        assertEquals(n*n*Math.PI, item.calculateSquare(), 0.00000001);
    }

    @Test
    public void calculatePerimeter() throws Exception {
        assertEquals(2*n*Math.PI, item.calculatePerimeter(), 0.00000001);

    }

}
package ru.sbt.lesson2.implementings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle item = new Rectangle(1,1);

    @Test
    public void calculateSquare() throws Exception {
        assertEquals(1,item.calculateSquare(), 0.00001);
    }

    @Test
    public void calculatePerimeter() throws Exception {
        assertEquals(4,item.calculatePerimeter(),0.00001);
    }

}
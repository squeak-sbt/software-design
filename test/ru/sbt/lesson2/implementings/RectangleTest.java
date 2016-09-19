package ru.sbt.lesson2.implementings;

import org.junit.Test;
import org.omg.CORBA.DoubleHolder;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class RectangleTest {
    private final static Rectangle rectangle = new Rectangle(4, 7);
    @Test
    public void calculateSquare() throws Exception {
        assertEquals(28.0, rectangle.calculateSquare(), 0.1);
    }

    @Test
    public void calculatePerimetr() throws Exception {
        assertEquals(22.0, rectangle.calculatePerimetr(), 0.1);
    }

}
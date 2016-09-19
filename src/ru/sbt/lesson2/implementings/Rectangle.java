package ru.sbt.lesson2.implementings;

import ru.sbt.lesson2.interfaces.Figure;

public class Rectangle implements Figure {
    private double a,b;

    @Override
    public double calculateSquare() {
        return a * b;
    }

    @Override
    public double calculatePerimetr() {
        return (a + b) * 2;
    }
}

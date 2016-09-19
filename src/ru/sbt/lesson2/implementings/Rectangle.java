package ru.sbt.lesson2.implementings;

import ru.sbt.lesson2.interfaces.Figure;

public class Rectangle implements Figure {
    private double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSquare() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }
}

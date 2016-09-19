package ru.sbt.lesson2.implementings;

import ru.sbt.lesson2.interfaces.Figure;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * radius * Math.PI;
    }
}

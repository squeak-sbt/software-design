package ru.sbt.lesson2.implementings;

import ru.sbt.lesson2.interfaces.Figure;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateSquare() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}

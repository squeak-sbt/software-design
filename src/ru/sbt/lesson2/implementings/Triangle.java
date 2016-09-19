package ru.sbt.lesson2.implementings;

import ru.sbt.lesson2.interfaces.Figure;

public class Triangle implements Figure {
    private int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateSquare() {
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimetr() {
        return a + b + c;
    }
}

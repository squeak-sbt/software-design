package ru.sbt.lesson2.testdriven;

import ru.sbt.lesson2.interfaces.Figure;

public class ShapeUtils {

    public Figure max(Figure figure1, Figure figure2) {
        double f1 = figure1.calculateSquare();
        double f2 = figure2.calculateSquare();
        return f1 > f2 ? figure1: figure2;
    }
}

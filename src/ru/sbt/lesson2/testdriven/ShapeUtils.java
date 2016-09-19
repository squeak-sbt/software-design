package ru.sbt.lesson2.testdriven;

import ru.sbt.lesson2.interfaces.Figure;

public class ShapeUtils {
    public Figure max(Figure figure1, Figure figure2){
        return figure1.calculateSquare() > figure2.calculateSquare() ? figure1 : figure2;
    }
}

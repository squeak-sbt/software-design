package ru.sbt.lesson2.testdriven;

import org.junit.Test;
import ru.sbt.lesson2.implementings.Circle;
import ru.sbt.lesson2.implementings.Square;
import ru.sbt.lesson2.implementings.Triangle;
import ru.sbt.lesson2.testdriven.ShapeUtils;

import static org.junit.Assert.assertEquals;

public class TestShapeUtils {
    @Test
    public void testMaxFigure(){
        ShapeUtils shapeUtils = new ShapeUtils();
        Circle biggerFigure = new Circle(20);
        Square smallerFigure = new Square(4);
        assertEquals(shapeUtils.max(biggerFigure, smallerFigure), biggerFigure);

        Triangle bigTriangle = new Triangle(50.0, 50.0, 50.0);
        assertEquals(shapeUtils.max(bigTriangle, smallerFigure), bigTriangle);
    }
}

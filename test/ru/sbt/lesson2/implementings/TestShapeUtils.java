package ru.sbt.lesson2.implementings;

import org.junit.Test;
import ru.sbt.lesson2.interfaces.Figure;
import ru.sbt.lesson2.testdriven.ShapeUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class TestShapeUtils {

    public void tesMaxShapeChoose(Figure figure1, Figure figure2){

        ShapeUtils choose = new ShapeUtils();
        double square_of_first = (double)figure1.calculateSquare();
        double square_of_second = (double)figure2.calculateSquare();
        Figure max = square_of_first > square_of_second ? figure1 : figure2;

        assertEquals(max, choose.max(figure1, figure2));
    }

    @Test
    public void test2() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        testCircleComparedSquare(Circle.class,10, Square.class,5);
    }
    public void testCircleComparedSquare (Class clazz, int size, Class clazz2, int size2) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Figure shape = (Figure) clazz.getConstructor(Double.TYPE).newInstance(new Integer[] { size } );
        
    }
}

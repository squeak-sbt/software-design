package ru.sbt.lesson2.testdriven;

import org.junit.Test;
import ru.sbt.lesson2.testdriven.MyStack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestStack {

    @Test
    public void testNewStackIsEmpty(){
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackIsNotEmptyAfterPush(){
        MyStack stack = new MyStack();
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopReturnsLastPushedValueAfterFewPushes(){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(12);
        stack.push(13);
        assertEquals(13, stack.pop());
    }


    @Test
    public void testIsEmptyAfterPopAllElements(){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}

package ru.sbt.lesson2.testdriven;

public class MyStack {

    private Node firstNode;
    public int size = 0;

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void push(int element) {
        if (firstNode == null) {
            firstNode = new Node(element);
        }
        else {
            Node prev = firstNode;
            firstNode = new Node(element);
            firstNode.next = prev;
        }
        size++;
    }

    public int pop() {
        size--;
        int result = 0;
        if (firstNode != null) {
            result = firstNode.element;
            firstNode = firstNode.next;
        }
        return result;
    }


    private class Node{
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }

    }
}

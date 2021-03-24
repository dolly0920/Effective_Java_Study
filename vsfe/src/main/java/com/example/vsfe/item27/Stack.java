package com.example.vsfe.item27;

public class Stack <E> {
    private Node<E> topNode;
    private int length;

    public Stack() {
        length = 0;
        this.topNode = null;
    }

    public boolean isEmpty() { return length == 0; }
    public int getLength() { return length; }

    public void push(E data) {
        Node<E> node = new Node<>(data);

        if(!isEmpty()) {
            topNode.next = node;
            node.prev = topNode;
        }
        topNode = node;
        length++;
    }

    public E pop() {
        if(isEmpty()) throw new IllegalStateException();
        E result = topNode.data;

        length--;
        topNode = topNode.prev;

        if (!isEmpty()) {
            topNode.next = null;
        }

        return result;
    }

    public E top() {
        if(isEmpty()) throw new IllegalStateException();

        return topNode.data;
    }
}

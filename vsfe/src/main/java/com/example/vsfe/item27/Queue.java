package com.example.vsfe.item27;

public class Queue <E> {
    private Node<E> frontNode, rearNode;
    private int length;

    public Queue () {
        frontNode = null;
        rearNode = null;
        length = 0;
    }

    public boolean isEmpty() { return length == 0; }
    public int getLength() { return length; }

    public void push(E data) {
        Node<E> node = new Node<>(data);

        if (isEmpty()) {
            frontNode = node;
        } else {
            rearNode.next = node;
            node.prev = rearNode;
        }
        rearNode = node;
        length++;
    }

    public E pop() {
        if (isEmpty()) throw new IllegalStateException();
        E result = frontNode.data;

        length--;
        frontNode = frontNode.next;

        if (isEmpty()) {
            rearNode = null;
        } else {
            frontNode.prev = null;
        }

        return result;
    }

    public E front() {
        if (isEmpty()) throw new IllegalStateException();
        return frontNode.data;
    }
}

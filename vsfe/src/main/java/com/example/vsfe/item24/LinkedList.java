package com.example.vsfe.item24;

import java.util.Iterator;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {}
    public int getSize() { return this.size; }
    public boolean isEmpty() { return getSize() == 0; }

    public void insert(int x) {
        Node next = new Node(x);
        if(this.head != null) {
            head.prev = next;
            next.next = head;
        }
        this.head = next;
    }

    public int remove() {
        if (isEmpty()) throw new IllegalStateException();

        int result = head.getData();
        head = head.next;
        head.prev = null;
        return result;
    }

    private class LLIterator implements Iterator<Node> {
        Node cur;

        LLIterator() { cur = LinkedList.this.head; }

        @Override
        public boolean hasNext() { return cur.next != null; }

        @Override
        public Node next() {
            cur = cur.next;
            return cur;
        }

        @Override
        public void remove() {
            if(LinkedList.this.getSize() == 1) {
                LinkedList.this.head = null;
                return;
            }
            if(cur.prev != null && cur.next != null) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            else if(cur.prev != null) {
                cur.prev.next = null;
            }
            else {
                cur.next.prev = null;
            }
        }

        public Node prev() {
            if (cur.prev == null) throw new IllegalStateException();
            cur = cur.prev;
            return cur;
        }
    }
}

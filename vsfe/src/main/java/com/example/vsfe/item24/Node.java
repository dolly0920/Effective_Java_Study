package com.example.vsfe.item24;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private final int data;
    Node prev, next;

    public Node(int x) {
        this.data = x;
    }
}

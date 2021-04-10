package com.example.vsfe.item27;

import lombok.Getter;

@Getter
public class Node <E>{
    E data;
    Node<E> next, prev;

    public Node (E data) {
        this.data = data;
    }
}
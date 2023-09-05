package com.example.dsa.collection.linkedList;

public class DoubleNode<E> {
    E value;
    DoubleNode<E> next;
    DoubleNode<E> prev;

    public DoubleNode(DoubleNode<E> prev,E value, DoubleNode<E> next) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

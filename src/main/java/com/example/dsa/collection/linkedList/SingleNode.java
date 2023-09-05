package com.example.dsa.collection.linkedList;

public class SingleNode<E> {
    E value;
    SingleNode<E> next;

    public SingleNode(E value, SingleNode<E> next) {
        this.value = value;
        this.next = next;
    }
}

package com.example.dsa.collection;

public interface Collection<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    boolean contains(Object var1);
    Object[] toArray();
    boolean add(E var1);
    boolean remove(Object var1);
    void clear();
    boolean equals(Object var1);
}

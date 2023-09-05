package com.example.dsa.collection.linkedList;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class DoubleLinkedList<E> extends AbstractList<E> {
    transient int size;
    transient DoubleNode<E> first;
    transient DoubleNode<E> last;

    public DoubleLinkedList() {
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E get(int index) {
        this.checkPositionIndex(index);
        return this.node(index).value;
    }

    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);
        if (index == this.size) {
            this.linkLast(element);
        } else {
            this.linkBefore(element, this.node(index));
        }
    }

    private void linkLast(E e) {
        DoubleNode<E> l = this.last;
        DoubleNode<E> newNode = new DoubleNode<>(l, e, null);
        this.last = newNode;
        if (l == null) {
            this.first = newNode;
        } else {
            l.next = newNode;
        }
        ++this.size;
        ++this.modCount;
    }

    private void linkBefore(E e, DoubleNode<E> insertedNode) {
        DoubleNode<E> pred = insertedNode.prev;
        DoubleNode<E> newNode = new DoubleNode<>(pred, e, insertedNode);
        insertedNode.prev = newNode;
        if (pred == null) {
            this.first = newNode;
        } else {
            pred.next = newNode;
        }
        ++this.size;
        ++this.modCount;
    }

    @Override
    public boolean add(E e) {
        this.linkLast(e);
        return true;
    }

    private void checkPositionIndex(int index) {
        if (!this.isPositionIndex(index)) {
            throw new IndexOutOfBoundsException(this.outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + this.size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= this.size;
    }

    @Override
    public E remove(int index) {
        this.checkPositionIndex(index);
        return this.unlink(this.node(index));
    }
    E unlink(DoubleNode<E> x) {
        E element = x.value;
        DoubleNode<E> next = x.next;
        DoubleNode<E> prev = x.prev;
        if (prev == null) {
            this.first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.value = null;
        --this.size;
        ++this.modCount;
        return element;
    }

    private DoubleNode<E> node(int index) {
        DoubleNode<E> xnode;
        int i;
        if (this.size < index >> 1) {
            xnode = this.first;
            for (i = 0; i < index; ++i) {
                xnode = xnode.next;
            }
            return xnode;
        } else {
            xnode = this.last;
            for (i = this.size - 1; i > index; --i) {
                xnode = xnode.prev;
            }
            return xnode;
        }
    }
}

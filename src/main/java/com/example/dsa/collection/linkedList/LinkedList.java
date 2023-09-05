package com.example.dsa.collection.linkedList;


import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

import com.example.dsa.collection.Collection;

public class LinkedList<E> extends AbstractSequentialList<E> implements Cloneable, Serializable, Collection<E> {
    transient int size;
    transient SingleNode<E> first;
    private static final long serialVersionUID = 876323262645176354L;

    public LinkedList() {
        this.size = 0;
    }

    @Override
    public boolean add(E e) {
        SingleNode<E> node = new SingleNode<>(e, null);
        if (this.first == null) {
            this.first = node;
            this.size++;
            return true;
        } else if (this.size > 0) {
            SingleNode<E> x = null;
            for (int i=0;i<this.size;i++){
                x=this.node(i);
            }
            if (x!=null) {
                x.next = node;
                this.size++;
                return true;
            }
        }
        return false;
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
    public void add(int index, E element) {
        this.checkPositionIndex(index);
        if (index == this.size) {
            this.add(element);
        } else if (index == 0) {
            this.first = new SingleNode<>(element, this.first);
            this.size++;
        } else {
            SingleNode<E> node = this.node(index);
            node.next = new SingleNode<>(element, node);
            this.size++;
        }
    }

    @Override
    public E get(int index) {
        this.checkPositionIndex(index);
        return this.node(index).value;
    }

    SingleNode<E> node(int index) {
        SingleNode x;
        int i;
        x = this.first;
        for (i = 0; i < index; ++i) {
            x = x.next;
        }

        return x;
    }


    @Override
    public E remove(int index) {
        checkPositionIndex(index);
        SingleNode<E> node = this.node(index);
        if (index > 1) {
            SingleNode<E> prevNode = this.node(index - 1);
            prevNode.next = node.next;
            this.size--;
        }
        return node.value;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}

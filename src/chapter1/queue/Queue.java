package chapter1.queue;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private Node first; // link to least recently added node
    private Node last; // link to most recently added node

    private int n; // size

    private class Node {
        // nested class to define class
        Item item;
        Node next; // link
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        // Add item to the end of the list
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) // is first null?
            first = last;
        else
            oldLast.next = last;
        n++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next; // make the next node the new first node
        n--;
        if (isEmpty())
            last = null;
        return item;

    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    // Use nested class to obtain node (first) variable
    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}

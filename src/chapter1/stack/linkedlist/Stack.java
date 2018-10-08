package chapter1.stack.linkedlist;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    Node first;

    private int n; // size

    private class Node  {
        Item item;
        Node next; // link
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        // Add item to top of stack
        Node oldFirst = first; // store old first value to be used later
        first = new Node(); // add new node to the front of the list
        first.item = item; // set the value for the new node
        first.next = oldFirst; // make new node reference the old node.
        n++; // increase the pointer
    }

    public Item pop() {
        Item item = first.item; // store the item before assigning new first
        first = first.next; // make the next node the new first node
        --n; // decrease the pointer
        return item;

    }

    public Item peekFirst() {
        return first.item;
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

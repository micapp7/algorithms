package chapter1.bag;

import java.util.Iterator;

// LIFO - order not important
// Pop - method removed

public class Bag<Item> implements Iterable<Item> {
   private Node first;

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

    /**
     * The same as push
     * @param item to add
     */

    public void add(Item item) {
        // Add item to top of stack
        Node oldFirst = first; // store old first value to be used later
        first = new Node(); // add new node to the front of the list
        first.item = item; // set the value for the new node
        first.next = oldFirst; // make new node reference the old node.
        n++; // increase the pointer
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

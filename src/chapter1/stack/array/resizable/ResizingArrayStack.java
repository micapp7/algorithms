package chapter1.stack.array.resizable;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    @SuppressWarnings("unchecked")
    private Item[] a = (Item[]) new Object[1]; // stack entries.
    private int n; // size

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int max) {
        // Move stack to a new array of size max.
        @SuppressWarnings("unchecked")
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++)
            temp[i] = a[i];
        a = temp;
    }

    public void push(Item item) {
        // double the length of array when it's full.
        if (n == a.length)
            resize(2 * a.length);
        a[n++] = item; // add item then increment index.
    }

    public Item pop() {
        Item item = a[--n];
        a[n] = null;
        // reduce the size of array if the current size is a quarter of the size of the array
        if(n > 0 && n == a.length/4)
            resize(a.length/2);
        return item; // remove last item in stack (n-1)
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    // Use nested class to obtain array (a) and array size (n) variables.
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = n-1; // get the last index
        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Item next() {
            return a[i--];
        } // get item at current index then move index down
    }
}

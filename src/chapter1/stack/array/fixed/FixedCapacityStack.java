package chapter1.stack.array.fixed;

/**
 * Use generics to make code more reusable.
 * @param <Item> client can specify any object type.
 */

public class FixedCapacityStack<Item> {
    private Item[] a; // stack entries.
    private int n; // size

    public FixedCapacityStack(int capacity) {

        a = (Item[]) new Object[capacity]; // cast required - common idiom used in java - ignore error
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        a[n++] = item; // add item then increment index.
    }

    public Item pop() {
        return a[--n]; // remove last item in stack (n-1)
    }

}

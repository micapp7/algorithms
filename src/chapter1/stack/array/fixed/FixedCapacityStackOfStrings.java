package chapter1.stack.array.fixed;

public class FixedCapacityStackOfStrings {
    private String[] a; // stack entries.
    private int n; // size

    public FixedCapacityStackOfStrings(int capacity) {
        a = new String[capacity]; // fixed size
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(String item) {
        a[n++] = item; // add item then increment index.
    }

    public String pop() {
        return a[--n]; // remove last item in stack (n-1)
    }

}

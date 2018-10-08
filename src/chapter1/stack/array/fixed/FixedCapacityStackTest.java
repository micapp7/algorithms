package chapter1.stack.array.fixed;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackTest {
    public static void main(String[] args) {
     FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if(!item.equals("-")) // if it is not a '-' character, add it to the stack.
                s.push(item);
            else if (!s.isEmpty()) // otherwise, remove the last item item on the stack.
                StdOut.print(s.pop() + " removed from stack");
        }
        StdOut.print("(" + s.size() + " left on stack)");

    }

}

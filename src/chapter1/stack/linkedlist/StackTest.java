package chapter1.stack.linkedlist;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StackTest {
    // Create a stack and push/pop strings as directed on StdIn
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.print(s.pop() + " removed from stack ");
        }


        StdOut.print(s.peekFirst() + " is at the top of stack");

        StdOut.println("(" + s.size() + " " + "left on stack)");
    }
}

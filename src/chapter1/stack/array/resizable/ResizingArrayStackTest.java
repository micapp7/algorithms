package chapter1.stack.array.resizable;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayStackTest {
    public static void main(String[] args) {
        ResizingArrayStack<String> s = new ResizingArrayStack<>();
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

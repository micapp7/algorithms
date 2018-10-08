package chapter1.queue;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QueueTest {
    // Create a queue and enqueue/dequeue strings
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                q.enqueue(item);
            else if (!q.isEmpty())
                StdOut.print(q.dequeue() + " removed from queue ");
        }

        // q isA iterable and implements iterator interface
        for(String item : q) {
            System.out.print(", " + item);
        }


        StdOut.println("(" + q.size() + " " + "left in queue)");
    }
}

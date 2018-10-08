package chapter1.bag;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Bag is a collection of data where removing items is not supported
 * Great for processing items when order is not important
 */

public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();
        while(!StdIn.isEmpty())
            numbers.add(StdIn.readDouble());
        int n = numbers.size();

        double sum = 0.0;
        for(double x : numbers)
            sum += x;
        double mean = sum/n;
        for(double x: numbers)
            sum += (x - mean)*(x - mean);
        double stddev = Math.sqrt(sum/(n-1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Stddev: %.2f\n", stddev);
    }
}

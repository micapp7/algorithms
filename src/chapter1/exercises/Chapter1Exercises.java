package chapter1.exercises;

import chapter1.stack.linkedlist.Stack;

/**
 * Exercise 1.3.4
 * Page 161
 */

public class Chapter1Exercises {
    
    public static boolean containsMatchingParenthesis(Stack<String> s) {
        // Handle early exit conditions first.
        if (s == null || s.size() == 1) return false;

        boolean containsParenthesis = false;

        while (!s.isEmpty()) {
            String current = s.pop();
            // if the current value is a closed parenthesis, confirm that the next value is an open one.
            if (current.equals(")")) {
                containsParenthesis = true;
                current = s.pop();
                if (!current.equals("(")) {
                    return false;
                }
            }
        }

        return containsParenthesis; // if there are no parenthesis, return false;
    }
}

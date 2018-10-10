package chapter1.exercises;

import chapter1.stack.linkedlist.Stack;

public class ParenthesesClient {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        String correctInput = "[()]{}{[()()]()}";

        //TODO: Fix NPE when the closing parentheses is the only value.
        String incorrectInput = "[(])";
        String singleInput = "(";


        for (Character c : singleInput.toCharArray()) {
            s.push(c.toString());
        }

        for (String item : s) {
            System.out.println(item);
        }
        System.out.println(containsEqualParentheses(s));


    }

    private static boolean containsEqualParentheses(Stack<String> s) {
        // Handle early exit conditions first.
        if (s == null || s.size() == 1 || s.peekFirst().equals("(")) return false;

        Stack<String> closedParenStack = new Stack<>();

        while (!s.isEmpty()) {
            String current = s.pop();
            // if the current value is a closed parenthesis, confirm that the next value is an open one.
            if (current.equals(")")) {
                closedParenStack.push(current);
                current = s.pop();
                if (!current.equals("(")) {
                    return false;
                }
            }
        }

        return !closedParenStack.isEmpty(); // if there are no parenthesis, return false;
    }
}

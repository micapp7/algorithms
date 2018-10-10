package chapter1.test;

import chapter1.exercises.Chapter1Exercises;
import chapter1.stack.linkedlist.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsMatchingParenthesisTest {
    private Stack<String> s;

    @Before
    public void setUp() throws Exception {
        s = new Stack<>();
    }

    @Test
    public void shouldReturnTrueWIthMatchingParenthesis() {
        final String correctInput = "[()]{}{[()()]()}";
        for (Character c : correctInput.toCharArray()) {
            s.push(c.toString());
        }
        assertTrue(Chapter1Exercises.containsMatchingParenthesis(s));
    }

    @Test
    public void shouldReturnFalseWithNonMatchingParenthesis() {
        final String incorrectInput = "[(])";
        for (Character c : incorrectInput.toCharArray()) {
            s.push(c.toString());
        }
        assertFalse(Chapter1Exercises.containsMatchingParenthesis(s));
    }

    @Test
    public void shouldReturnFalseWhenStackIsNull() {
        assertFalse(Chapter1Exercises.containsMatchingParenthesis(s));
    }

    @Test
    public void shouldReturnFalseWhenStackHasOneItem() {
        final String incorrectInput = ")";
        for (Character c : incorrectInput.toCharArray()) {
            s.push(c.toString());
        }
        assertFalse(Chapter1Exercises.containsMatchingParenthesis(s));
    }
}
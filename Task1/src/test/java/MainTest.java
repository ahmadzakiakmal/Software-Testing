package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testEuclideanDistance() {
        assertEquals(5.0, Main.euclideanDistance(0, 0, 3, 4), 0.001, "Distance between (0,0) and (3,4) should be 5.0");
        assertEquals(0.0, Main.euclideanDistance(1, 1, 1, 1), 0.001, "Distance between the same points should be 0.0");
        assertEquals(2, Main.euclideanDistance(0, 0, 1, 1), 0.001, "Distance between (0,0) and (1,1) should be approximately 1.414");
    }

    @Test
    public void testIsPalindrome() {
        assertFalse(Main.isPalindrome("hello"), "Word 'hello' is not a palindrome");
        assertTrue(Main.isPalindrome("racecar"), "Word 'racecar' is a palindrome");
        assertTrue(Main.isPalindrome("race car"), "Phrase should be a palindrome ignoring case and spaces");
        assertTrue(Main.isPalindrome("Racecar"), "Phrase should be a palindrome despite the capitalization");
        assertTrue(Main.isPalindrome(" "), "A single space should be considered a palindrome");
        assertFalse(Main.isPalindrome(null), "Null should not be considered a palindrome");
    }
}

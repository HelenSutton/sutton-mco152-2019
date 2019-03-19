package sutton.dictionary;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void isPalindrome_true() throws FileNotFoundException {
        Palindrome palindrome = new Palindrome();


        assertTrue(palindrome.isPalindrome("racecar"));
    }

    @Test
    public void isPalindrome_false() throws FileNotFoundException{
        Palindrome palindrome = new Palindrome();


        assertFalse(palindrome.isPalindrome("abdfba"));
    }

}
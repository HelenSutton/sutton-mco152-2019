package sutton.dictionary;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    @Test
    public void contains_true() throws FileNotFoundException {
        long time = System.currentTimeMillis();
        Dictionary dictionary = new Dictionary();
        System.out.println(System.currentTimeMillis()-time);

        assertTrue(dictionary.contains("aa"));
    }

    @Test
    public void isPalindrome_true() throws FileNotFoundException{
        Dictionary dictionary = new Dictionary();


        assertTrue(dictionary.isPalindrome("racecar"));
    }

    @Test
    public void isPalindrome_false() throws FileNotFoundException{
        Dictionary dictionary = new Dictionary();


        assertFalse(dictionary.isPalindrome("abdfba"));
    }

    @Test
    public void contains_false() throws FileNotFoundException{
        Dictionary dictionary = new Dictionary();

        assertFalse(dictionary.contains("Wonderfu"));
    }

    @Test
    public void amount()throws FileNotFoundException{
        Dictionary dictionary = new Dictionary();

        assertEquals(45336, dictionary.amount());

    }

}
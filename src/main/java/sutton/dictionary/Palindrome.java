package sutton.dictionary;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Palindrome {
    ArrayList<String> palindromes = new ArrayList<>();
    Dictionary dictionary = new Dictionary();

    public Palindrome() throws FileNotFoundException {
    }

    public void findPalindromes (){
        for (String word : dictionary.myDictionary) {
            if (isPalindrome(word)){
                palindromes.add(word);
            }
        }
    }

    public boolean isPalindrome(String word){
        int i = 0;
        int j = word.length()-1;
        while (i < j){
            if (word.charAt(i) == word.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}

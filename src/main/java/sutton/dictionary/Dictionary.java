package sutton.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    ArrayList<String> myDictionary = new ArrayList<>();
    ArrayList<String> palindromes = new ArrayList<>();
    public Dictionary () throws FileNotFoundException {
        File file = new File("dictionary.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()){
            myDictionary.add(input.next());
            input.nextLine();
        }

    }
    public boolean contains(String word){
        return myDictionary.contains(word.toUpperCase());
    }

    public int amount(){
        return myDictionary.size();
    }

    public void findPalindromes (){
       for (String word : myDictionary) {
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

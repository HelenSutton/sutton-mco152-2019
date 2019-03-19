package sutton.dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bananagrams {

    private ArrayList<String> myWords = new ArrayList<>();
    private int myLetters [] = new int [26];
    private ArrayList<String> dictionary;

    //for tests
    public Bananagrams (String letters, ArrayList<String> dictionary){
        this.dictionary = dictionary;
        letters = letters.toUpperCase();
        for (char c: letters.toCharArray()){
            int letter = c - 'A';
            myLetters[letter]++;
        }
    }

    public Bananagrams (Dictionary dictionary){
        this.dictionary = dictionary.getList();
        Random r = new Random();
        for (int i = 0; i < 14; i++){
            myLetters [r.nextInt(26)] ++;
        }
    }



    public List<String> findWords (){
        for(String word: dictionary){
            if (hasWord(word)){
                myWords.add(word);
            }
        }
        return myWords;
    }


    private boolean hasWord (String word){
        word = word.toUpperCase();
        int amountOfLetter [] = new int[26];
        for (char c: word.toCharArray()){
            int letter = c - 'A';
            amountOfLetter [letter]++;
            if (amountOfLetter[letter] > myLetters[letter]){
                return false;
            }
        }
        return true;
    }

}

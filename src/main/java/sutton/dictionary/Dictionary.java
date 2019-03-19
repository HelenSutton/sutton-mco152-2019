package sutton.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private ArrayList<String> list = new ArrayList<>();

    public Dictionary () throws FileNotFoundException {
        File file = new File("dictionary.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()){
           list.add(input.next());
            input.nextLine();
        }

    }
    public boolean contains(String word){
        return list.contains(word.toUpperCase());
    }

    public int amount(){
        return list.size();
    }

    public ArrayList<String> getList (){return list;}




}

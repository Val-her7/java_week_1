import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class Challenge5 {
    public static void readFile(){
        HashMap<String, Integer> countingWords = new HashMap<>();
        String texte = "";

        //Read File line-by-line and concat to full text
        try(BufferedReader reader = new BufferedReader(new FileReader("src\\text.txt"))){
            System.out.println("The file exists!");
            String line;
            while((line = reader.readLine())!= null){
                texte += line;
            }
        }
        catch(FileNotFoundException error){
            System.out.println("Sorry, we cannot locate file location");
        }
        catch(IOException error){
            System.out.println("Something went wrong");
            error.printStackTrace();
        }
        
        //Clean text to count occurences of words
        String[] arrayWords = texte.split("\\s+");
        for(String word: arrayWords){
            word = word.replaceAll("[.,?!']", "").toLowerCase();
            if(countingWords.containsKey(word)){
                countingWords.put(word, countingWords.get(word)+1);
            }
            else{
                countingWords.put(word, 1);
            }
        }
        System.out.println(countingWords);

        //Find most frequently used word
        int mostFrequentlyUsedWord = (Collections.max(countingWords.values()));
        for(String key: countingWords.keySet()){
            if(countingWords.get(key)== mostFrequentlyUsedWord){
                System.out.println("The most frequently used word is: " + key);
            }
        }
    }
}
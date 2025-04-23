import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class Challenge6 {
    public static void readFile(){
        HashMap<Character, Integer> countingLetters = new HashMap<>();
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
        
        //Clean text to only have letters and count occurences
        String letters = texte.replaceAll("[^\\p{L}]", "").toLowerCase();
        
        for(int i = 0; i < letters.length(); i++){
            Character letter = letters.charAt(i);
            if(countingLetters.containsKey(letter)){
                countingLetters.put(letter, countingLetters.get(letter)+1);
            }
            else{
                countingLetters.put(letter, 1);
            }
        }
        System.out.println(countingLetters);

        //Find most frequently used letter
        int mostFrequentlyUsedLetter = (Collections.max(countingLetters.values()));
        for(Character key: countingLetters.keySet()){
            if(countingLetters.get(key)== mostFrequentlyUsedLetter){
                System.out.println("The most frequently used letter is: " + key);
            }
        }
    }
}
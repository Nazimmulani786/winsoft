import java.util.HashMap;
import java.util.*;
public class CountwordQ3 
{
    public static void main(String[] args) 
    {
        String Line = "Hello World i'm a Nazim Mulani MCA second year student.I am passionate about the programming languages.";
        HashMap<String, Integer> wordCountMap = countWords(Line);
        for (String word : wordCountMap.keySet()) 
        {
            System.out.println("'" + word + "' occurs " + wordCountMap.get(word) + " times.");
        }
    }
    
    public static HashMap<String, Integer> countWords(String Line) 
    {
        String[] words = Line.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) 
        {
            word = word.replaceAll("[^a-zA-Z]", "");
            word = word.toLowerCase();
            if (word.length() > 0) 
            {
                if (wordCountMap.containsKey(word)) 
                {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else 
                {
                    wordCountMap.put(word, 1);
                }
            }
        }
        return wordCountMap;
    }
}
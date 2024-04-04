import java.util.HashMap;
import java.util.Map;

public class DuplicateChar
{
    public static void main(String[] args)
     {
        String str = "Nazim Mulani";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) 
    {
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (charMap.containsKey(ch)) 
            {
                charMap.put(ch, charMap.get(ch) + 1);
            } else 
            {
                charMap.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) 
        {
            if (entry.getValue() > 1) 
            {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
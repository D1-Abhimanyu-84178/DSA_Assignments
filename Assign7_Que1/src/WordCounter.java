import java.util.*;

public class WordCounter {
    
    public static Map<String, Integer> countWords(String line) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        String[] words = line.split("\\s+");        
        for (String word : words) {
            word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");            
            String lowercaseWord = word.toLowerCase();
            if (wordCount.containsKey(lowercaseWord)) {
                wordCount.put(lowercaseWord, wordCount.get(lowercaseWord) + 1);
            } else {
                wordCount.put(lowercaseWord, 1);
            }
        }
        
        return wordCount;
    }
    
    public static void main(String[] args) {
        String line = "apple banana Apple orange Banana apple";
        Map<String, Integer> wordCounts = countWords(line);        
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

import java.util.*;

public class CountAnagrams {
    public static void main(String[] args) {
        String sentence = "listen silent apple mango dog god madam racecar";

        int count = find(sentence);
        System.out.println("Count of Anagram Words: " + count);
    }

    public static int find(String sentence) {
        String[] words = sentence.split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            String sortedWord = sort(word);
            freqMap.put(sortedWord, freqMap.getOrDefault(sortedWord, 0) + 1);
        }

        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq > 1) {
                count += freq;
            }
        }

        return count;
    }

    public static String sort(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

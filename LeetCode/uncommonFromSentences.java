package LeetCode;


public class uncommonFromSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        
        Map<String, Integer> map = new HashMap<>();
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        
        for (String word : a) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : b) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        List<String> uncommonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }
        
        String[] result = uncommonWords.toArray(new String[0]);
        
        // Print the result
        for (String word : result) {
            System.out.println(word);
        }
    }
}

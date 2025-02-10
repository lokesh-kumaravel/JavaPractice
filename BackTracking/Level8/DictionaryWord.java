package Level8;

import java.util.*;

public class DictionaryWord {
    static String dictionary[] = { "mobile", "it", "vac", "itvac", "man", "mango", "icecream", "and", "go", "i", "love",
            "ice", "cream" };

    public static List<String> wordBreak(String s, Set<String> dict) {
        return wordBreakHelper(s, dict, "");
    }

    private static List<String> wordBreakHelper(String s, Set<String> dict, String result) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            res.add(result.trim());
            return res;
        }

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (dict.contains(prefix)) {
                res.addAll(wordBreakHelper(s.substring(i), dict, result + prefix + " "));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Set<String> dict = new HashSet<>();
        for (String word : dictionary) {
            dict.add(word);
        }
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String input = s.nextLine();
            // System.out.println(input);
            List<String> results = wordBreak(input, dict);
            for (String sentence : results) {
                System.out.println(sentence);
            }
        }
    }
}
// String input = "ilovegomobileitvacmangoicecream";
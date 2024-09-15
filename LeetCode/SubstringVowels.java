package LeetCode;
import java.util.HashMap;

public class SubstringVowels {
    public static void main(String[] args) {
        String s = "aeiou"; // Sample input string

        HashMap<String, Integer> track = new HashMap<>();
        String currentState = "ttttt";
        track.put(currentState, -1);
        int maxLength = 0;
        int i = 0;

        for (char c : s.toCharArray()) {
            StringBuilder temp = new StringBuilder(currentState);
            int changeAt = -1;

            switch (c) {
                case 'a':
                    changeAt = 0;
                    break;
                case 'e':
                    changeAt = 1;
                    break;
                case 'i':
                    changeAt = 2;
                    break;
                case 'o':
                    changeAt = 3;
                    break;
                case 'u':
                    changeAt = 4;
                    break;
            }

            if (changeAt != -1) {
                if (currentState.charAt(changeAt) == 'f') {
                    temp.setCharAt(changeAt, 't');
                } else {
                    temp.setCharAt(changeAt, 'f');
                }
            }

            currentState = temp.toString();

            if (track.containsKey(currentState)) {
                int lastIndex = track.get(currentState);
                maxLength = Math.max(maxLength, i - lastIndex);
            } else {
                track.put(currentState, i);
            }

            i++;
        }

        System.out.println("Length of the longest substring with alternating vowels: " + maxLength);
    }
}

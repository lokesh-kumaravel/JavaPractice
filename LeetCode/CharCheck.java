
package LeetCode;
import java.util.HashSet;
import java.util.Set;

public class CharCheck {

    public static void main(String[] args) {
        String allowed = "ab"; 
        String[] words = {"ad", "bd", "aaab", "baa", "badab"}; 

        CharCheck mainObj = new CharCheck();
        
        int result = mainObj.countConsistentStrings(allowed, words);

        System.out.println("Number of consistent strings: " + result);
    }

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int count = 0;
        for(String word : words) {
            boolean isConsistent = true;
            for(char ch : word.toCharArray()) {
                if(!set.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) {
                count++;
            }
        }
        return count;
    }
}

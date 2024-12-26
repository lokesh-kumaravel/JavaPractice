package Level4;

import java.util.*;

public class TeleCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        if (str.charAt(0) == '1') {
            System.out.println("No Combination of Strings");
            return;
        }
        Solution solution = new Solution();
        List<String> result = solution.find(str);
        Iterator<String> i = result.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}

class Solution {
    public List<String> find(String digits) {
        List<String> res = new ArrayList<>();

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backTrack(0, digits, new StringBuilder(), res, map);
        return res;
    }

    private void backTrack(int index, String digits, StringBuilder comb, List<String> res, Map<Character, String> map) {
        if (index == digits.length()) {
            res.add(comb.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backTrack(index + 1, digits, comb, res, map);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
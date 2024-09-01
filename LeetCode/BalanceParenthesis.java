package LeetCode;

import java.util.Stack;
public class BalanceParenthesis {
     public static void main(String[] args) {
        String s = "(()))";  // Example input string
        System.out.println(minInsertions(s));
    }
    
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (i + 1 < s.length() && s.charAt(i) == ')' && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        return count + (2 * stack.size());
    }
}


// class Solution {
//     public int minInsertions(String s) {
//         int res = 0;
//         int need = 0;
//         for(char ch : s.toCharArray()){
//             if(ch == '('){
//                 need += 2;
//                 if(need%2 == 1){
//                     res++;
//                     need--;
//                 }
//             }else if(ch == ')'){
//                 need--;
//                 if(need == -1){
//                     res++;
//                     need = 1;
//                 }
//             }
//         }
//         return res+need;
//     }
// }
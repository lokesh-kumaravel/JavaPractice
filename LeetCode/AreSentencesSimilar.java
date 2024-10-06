package LeetCode;

public class AreSentencesSimilar {
    public static void main(String[] args) {
        class Solution {
            public boolean areSentencesSimilar(String s1, String s2) {
                if(s1.length() < s2.length()) {
                    String temp = s1;
                    s1 = s2;
                    s2 = temp;
                }
                String[] a = s1.split(" ");
                String[] b = s2.split(" ");
                int n1 = a.length;
                int n2 = b.length;
                int start = 0;
                int end = 0;
                while(start < n2 && a[start].equals(b[start])) {
                    start++;
                }
                while(end < n2 && a[n1 - end - 1].equals(b[n2 - end - 1])) {
                    end++;
                }
                return start + end >= n2;
            }
        }

        Solution solution = new Solution();
        String s1 = "I am happy";
        String s2 = "I am";
        boolean result = solution.areSentencesSimilar(s1, s2);
        System.out.println(result);
    }
}

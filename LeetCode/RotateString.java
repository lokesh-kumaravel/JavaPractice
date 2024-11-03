package LeetCode;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        if (s.length() != goal.length()) {
            System.out.println("Can \"" + goal + "\" be obtained by rotating \"" + s + "\": false");
        } else {
            String str = s + s;
            boolean result = str.contains(goal);
            System.out.println("Can \"" + goal + "\" be obtained by rotating \"" + s + "\": " + result);
        }
    }
}

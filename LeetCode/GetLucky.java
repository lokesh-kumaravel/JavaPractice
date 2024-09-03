package LeetCode;


public class GetLucky {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i) - 'a' + 1);
        }
        s = str.toString();
        
        while (k > 0) {
            int sum = 0;
            for (char a : s.toCharArray()) {
                sum += a - '0';
            }
            s = String.valueOf(sum);
            k--;
        }
        
        int result = Integer.parseInt(s);
        System.out.println("The result is: " + result);
    }
}
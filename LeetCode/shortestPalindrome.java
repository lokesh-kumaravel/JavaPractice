package LeetCode;


//Hard 214
public class shortestPalindrome {
    public static void main(String[] args) {
        String s = "abc"; // Example input
        String t = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < t.length(); i++) {
            if (s.startsWith(t.substring(i))) {
                System.out.println(t.substring(0, i) + s); 
                return;
            }
        }

        System.out.println(t + s); 
    }
}

public class CountPalindromes {
    public static void main(String[] args) {
        String input = "madam racecar level apple noon civic";

        int count = countPalindromes(input);
        System.out.println("Count of Palindromes: " + count);
    }

    public static int countPalindromes(String str) {
        String[] words = str.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

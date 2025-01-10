package LeetCode;

public class MaximumSwap {
    public static void main(String[] args) {
        int num = 2736;
        String str = Integer.toString(num);
        char[] digit = str.toCharArray();
        int max = num;

        for (int i = 0; i < digit.length; i++) {
            for (int j = i + 1; j < digit.length; j++) {
                char temp = digit[i];
                digit[i] = digit[j];
                digit[j] = temp;
                int swapped = Integer.parseInt(new String(digit));
                max = Math.max(max, swapped);
                temp = digit[i];
                digit[i] = digit[j];
                digit[j] = temp;
            }
        }
        System.out.println("Maximum swap for " + num + ": " + max);
    }
}

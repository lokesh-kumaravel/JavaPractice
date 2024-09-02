package LeetCode;

public class SqrtCalculator {
    public static void main(String[] args) {
        // Example long values
        long[] values = {0L, 1L, 4L, 10L, 100L, 10000000000L};

        // Calculate and print square roots
        for (long value : values) {
            int result = mySqrt(value);
            System.out.println("The integer square root of " + value + " is: " + result);
        }
    }

    public static int mySqrt(long x) {
        long left = 1;
        long right = x + 1;
        while (left < right) {
            final long mid = (left + right) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return (int) left - 1;
    }
}

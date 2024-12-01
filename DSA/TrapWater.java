package DSA;

import java.util.Arrays;

public class TrapWater {

    public int trap(int[] a) {
        int sum = 0;
        int n = a.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 0);
        Arrays.fill(right, 0);
        int maxl = 0;
        int maxr = 0;

        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
            left[i] = maxl;
            right[j] = maxr;
            maxl = Math.max(maxl, a[i]);
            maxr = Math.max(maxr, a[j]);
        }

        for (int i = 0; i < n; i++) {
            int pot = Math.min(left[i], right[i]);
            sum += Math.max(0, pot - a[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        TrapWater solution = new TrapWater();
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = solution.trap(heights);
        System.out.println("The trapped water is: " + result);
    }
}

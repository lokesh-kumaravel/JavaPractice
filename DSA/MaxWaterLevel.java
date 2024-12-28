package DSA;

import java.util.*;

public class MaxWaterLevel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(",");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        int left = 0;
        int right = a.length - 1;
        int maxarea = 0;
        while (left < right) {
            int curarea = Math.min(a[left], a[right]) * (right - left);
            maxarea = Math.max(maxarea, curarea);
            if (a[left] < a[right]) {
                left++;
            } else {
                right--;
            }
        }
        s.close();
        System.out.println(maxarea);
    }
}
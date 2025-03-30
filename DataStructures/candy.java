package DataStructures;

import java.util.Arrays;

public class candy {
    public static void main(String[] args) {
        int[] ratings = { 1, 0, 2 };
        int[] arr = new int[ratings.length];
        Arrays.fill(arr, 1);
        for (int i = 1; i < arr.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i]) {
                if (arr[i] > arr[i + 1] + 1) {
                    continue;
                }
                arr[i] = arr[i + 1] + 1;
            }
        }
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        System.out.println(count);
    }
}

package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        
        // Call the arrayRankTransform method
        int[] result = arrayRankTransform(arr);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] original = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], rank);
                rank++;
            }
        }
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = map.get(original[i]);
        }
        return a;
    }
}

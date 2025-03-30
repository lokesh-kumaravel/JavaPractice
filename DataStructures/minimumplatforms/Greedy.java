package DataStructures.minimumplatforms;

import java.util.*;

public class Greedy {
    public static void main(String[] args) {
        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int platforms = 0;
        int max = 0;
        while (i < arr.length) {
            if (arr[i] <= dep[j]) {
                platforms++;
                max = Math.max(max, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        System.out.println("Minimun Platforms : " + max);
    }
}

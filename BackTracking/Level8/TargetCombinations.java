package Level8;

import java.util.*;

public class TargetCombinations {
    public static void main(String[] args) {
        int n = 7;
        int[] a = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        ArrayList<ArrayList<Integer>> list = check(n, a, target);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<ArrayList<Integer>> check(int n, int[] a, int target) {
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), a, 0, target);
        return result;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> result, List<Integer> current, int[] a, int start,
            int target) {
        if (target == 0) {
            if (!result.contains(current)) {
                result.add(new ArrayList<>(current));
                return;
            }
        }
        for (int i = start; i < a.length; i++) {
            // if(i>start&&a[i]==a[i-1])
            // {
            // continue;
            // }
            if (a[i] > target) {
                break;
            }
            current.add(a[i]);
            backtrack(result, current, a, i + 1, target - a[i]);
            current.remove(current.size() - 1);
        }
    }
}
package DSA;

import java.util.*;

public class TargetCombiations {
    public static void main(String[] args) {
        int n = 7;
        int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        ArrayList<ArrayList<Integer>> res = check(n, nums, target);
        System.out.println(res);

    }

    public static ArrayList<ArrayList<Integer>> check(int n, int[] a, int target) {
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), a, 0, target);
        return result;
    }

    public static void backtrack(ArrayList<ArrayList<Integer>> result, List<Integer> curlist, int[] a, int start,
            int target) {
        if (target == 0) {
            if (!result.contains(curlist)) {
                result.add(new ArrayList<>(curlist));
                return;
            }
        }
        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1]) {
                continue;
            }
            if (a[i] > target) {
                break;
            }
            curlist.add(a[i]);
            backtrack(result, curlist, a, i + 1, target - a[i]);
            curlist.remove(curlist.size() - 1);
        }
    }
}

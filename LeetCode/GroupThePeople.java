package LeetCode;

import java.util.*;

public class GroupThePeople {
    public static void main(String[] args) {
        int[] groupSizes = { 3, 3, 3, 3, 3, 1, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> list = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            list.putIfAbsent(size, new ArrayList<>());
            list.get(size).add(i);

            if (list.get(size).size() == size) {
                ans.add(new ArrayList<>(list.get(size)));
                list.get(size).clear();
            }
        }

        // Print the result
        System.out.println(ans);
    }
}

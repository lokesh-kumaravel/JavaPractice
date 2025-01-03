package LeetCode;

import java.util.*;

public class SmallestRange {
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15));
        nums.add(Arrays.asList(1, 5, 20));
        nums.add(Arrays.asList(6, 8, 9));

        int[] res = new int[2];
        int minRange = Integer.MAX_VALUE;
        int maxy = Integer.MIN_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<>((i, j) -> i[0] - j[0]);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).get(0) > maxy)
                maxy = nums.get(i).get(0);
            pq.offer(new int[]{nums.get(i).get(0), i, 0});
        }

        while (!pq.isEmpty()) {
            int[] min = pq.poll();
            int i = min[1];
            int j = min[2];

            if (maxy - min[0] < minRange) {
                minRange = maxy - min[0];
                res[0] = min[0];
                res[1] = maxy;
            }

            if (j + 1 < nums.get(i).size()) {
                pq.offer(new int[]{nums.get(i).get(j + 1), i, j + 1});
                if (nums.get(i).get(j + 1) > maxy)
                    maxy = nums.get(i).get(j + 1);
            } else {
                break;
            }
        }

        System.out.println("Smallest Range: [" + res[0] + ", " + res[1] + "]");
    }
}

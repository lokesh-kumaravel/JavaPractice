package DSA;

import java.util.*;

public class SkyLineProblem {

    public static List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();

        // Create a list of all critical points
        List<int[]> height = new ArrayList<>();

        for (int[] b : buildings) {
            height.add(new int[] { b[0], -b[2] }); // Start point with negative height
            height.add(new int[] { b[1], b[2] }); // End point with positive height
        }

        for (int[] heights : height) {
            System.out.println(Arrays.toString(heights));
        }
        // Sort the critical points
        Collections.sort(height, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        System.out.println("AFTER SORTING : ");
        for (int[] heights : height) {
            System.out.println(Arrays.toString(heights));
        }

        // Max-heap to keep track of heights
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.offer(0);
        int prev = 0;

        // Process all points
        for (int[] h : height) {
            if (h[1] < 0) {
                pq.offer(-h[1]); // start point
            } else {
                pq.remove(h[1]); // end point
            }

            int cur = pq.peek();
            if (prev != cur) {
                result.add(Arrays.asList(h[0], cur));
                prev = cur;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] buildings = {
                { 2, 9, 10 },
                { 3, 7, 15 },
                { 5, 12, 12 },
                { 15, 20, 10 },
                { 19, 24, 8 },
        };

        List<List<Integer>> skylineResult = getSkyline(buildings);

        System.out.println("Skyline:");
        for (List<Integer> point : skylineResult) {
            System.out.println(point);
        }
    }
}

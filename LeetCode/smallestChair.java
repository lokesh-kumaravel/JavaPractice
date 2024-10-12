package LeetCode;

import java.util.*;

public class smallestChair {
     public static void main(String[] args) {
        int[][] times = {{0, 10}, {1, 2}, {2, 3}, {5, 10}};
        int targetFriend = 0;

        int targetStart = times[targetFriend][0];
        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> available = new PriorityQueue<>();
        for (int i = 0; i < times.length; ++i) {
            available.offer(i);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int chair = -1;
        for (int i = 0; i < times.length; ++i) {
            while (!pq.isEmpty() && pq.peek()[0] <= times[i][0]) {
                available.offer(pq.poll()[1]);
            }

            if (times[i][0] == targetStart) {
                chair = available.peek();
                break;
            }

            pq.offer(new int[]{times[i][1], available.poll()});
        }

        System.out.println("The smallest chair for target friend is: " + chair);
    }   
}

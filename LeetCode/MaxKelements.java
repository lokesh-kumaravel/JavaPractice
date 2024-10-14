package LeetCode;

import java.util.PriorityQueue;

public class MaxKelements {
    public static void main(String[] args) {
        int[] nums = {10, 5, 3};
        int k = 2;
        long score = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            maxHeap.offer(num);
        }
        for (int i = 0; i < k; i++) {
            int maxElement = maxHeap.poll();
            score += maxElement;
            maxHeap.offer((int) Math.ceil(maxElement / 3.0));
        }
        System.out.println("The maximum score is: " + score);
    }
}

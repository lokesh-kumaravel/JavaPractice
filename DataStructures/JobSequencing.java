package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {
        int[] deadlines = { 3, 1, 2, 2 };
        int[] profits = { 50, 10, 20, 30 };

        ArrayList<Integer> result = jobSequencing(deadlines, profits);
        System.out.println(result);
    }

    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int[][] jobs = new int[n][2];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, jobs[i][0]);
        }

        int[] slots = new int[max + 1];
        Arrays.fill(slots, -1);

        int jobCount = 0, maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int d = jobs[i][0];
            int p = jobs[i][1];
            for (int j = d; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = p;
                    maxProfit += p;
                    jobCount++;
                    break;
                }
            }
        }

        return new ArrayList<>(Arrays.asList(jobCount, maxProfit));
    }
}

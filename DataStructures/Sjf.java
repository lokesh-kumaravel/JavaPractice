package DataStructures;

import java.util.Arrays;

class Sjf {
    static double solve(int bt[]) {
        Arrays.sort(bt);
        int sum = 0;
        int cumSum = 0;
        int n = bt.length;

        for (int i = 0; i < n; i++) {
            sum += cumSum;
            cumSum += bt[i];
        }

        return (double) sum / n;
    }

    public static void main(String[] args) {
        int[] burstTimes = { 3, 1, 4, 2, 5 };
        System.out.println("Average Waiting Time: " + solve(burstTimes));
    }
}

package DSA;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class WeightFind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int arr[][]  = new int[n+1][n+1];
        for (int[] row : arr) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        for(int i = 0 ; i < v ; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            arr[s][d] = w;
        }
        int[] dist = new int[n+1];
        boolean[] vis = new boolean[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        int source = sc.nextInt();
        int dest = sc.nextInt();
        dist[source] = 0;

       PriorityQueue<Integer> qe = new PriorityQueue<>();
        qe.add(source);

        while (!qe.isEmpty()) {
            int node = qe.poll();
            if(!vis[node]){
                vis[node] = true;
            }
            for (int i = 0; i <= n; i++) {
                if (arr[node][i] != Integer.MAX_VALUE && !vis[i] && dist[node] + arr[node][i] < dist[i]) {
                    dist[i] = dist[node] + arr[node][i];
                     vis[node] = true;
                    qe.add(i);
                }
            }
        }
        System.out.print(dist[dest]);
    }
}

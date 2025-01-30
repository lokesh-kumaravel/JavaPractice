package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPath {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            int n1 = s.nextInt() - 1;
            int n2 = s.nextInt() - 1;
            list.get(n1).add(n2);
        }
        int from = s.nextInt() - 1;
        int to = s.nextInt() - 1;
        int shortestPathLength = BFS(from, to, n);
        System.out.println(shortestPathLength);
    }

    public static int BFS(int start, int end, int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] d = new int[n];
        Arrays.fill(d, -1);
        q.add(start);
        d[start] = 0;
        while (!q.isEmpty()) {
            int k = q.remove();
            if (k == end) {
                return d[end];
            }
            for (int i = 0; i < list.get(k).size(); i++) {
                if (d[list.get(k).get(i)] == -1) {
                    q.add(list.get(k).get(i));
                    d[list.get(k).get(i)] = d[k] + 1;
                }
            }
        }
        // System.out.println(Arrays.toString(d));
        return 0;
    }
}

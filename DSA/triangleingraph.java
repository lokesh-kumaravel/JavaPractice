package DSA;

import java.util.Scanner;

public class triangleingraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        while (sc.hasNextInt()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            arr[n1][n2] = 1;
            arr[n2][n1] = 1;
            
        }
        sc.close();
        // int n = maxVertex + 1;
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr1[i][j] += arr[i][k] * arr[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
        int trace = 0;
        for (int i = 0; i < n; i++) {
            trace += arr2[i][i];
        }

        System.out.print(trace / 6);
    }
}

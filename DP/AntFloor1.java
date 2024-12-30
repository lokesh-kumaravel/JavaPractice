
package DP;

import java.util.*;

public class AntFloor1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][] = {
                { 11, 12, 13, 14 },
                { 1, 2, 3, 15 },
                { 5, 7, 8, 16 },
                { 1, 2, 3, 17 }
        };
        int[][] main = new int[4][4];
        int n = 4;
        main[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (main[i][j] == 0) {
                    main[i][j] = 1;
                }
                if (j == 0) {
                    main[i][j] = 1;
                }
                if (i + 1 < n) {
                    if (a[i + 1][j] - a[i][j] == 1) {
                        main[i + 1][j] = main[i][j] + 1;
                    }
                }
                if (j + 1 < n) {
                    if (a[i][j + 1] - a[i][j] == 1) {
                        main[i][j + 1] = main[i][j] + 1;
                    }
                }
                // if (i - 1 >= 0) {
                // if (a[i - 1][j] - a[i][j] == 1) {
                // int temp = main[i][j] + 1;
                // main[1 - 1][j] = Math.max(temp, main[i - 1][j]);
                // }
                // }
                // if (j - 1 >= 0) {
                // if (a[i][j - 1] - a[i][j] == 1) {
                // int temp = main[i][j] + 1;
                // main[i][j - 1] = Math.max(temp, a[i][j-1]);
                // }
                // }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(main[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// package DP;

// import java.util.*;

// public class AntFloor {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int a[][] = {
// { 23, 24, 2, 1 },
// { 22, 2, 15, 14 },
// { 21, 7, 8, 16 },
// { 0, 2, 2, 3 }
// };
// int[][] main = new int[4][4];
// int n = 4;
// main[n-1][n-1] = 1;
// for (int i = n-1; i >= 0; i--) {
// for (int j = n-1; j >= 0; j--) {
// if(main[i][j]==0)
// {
// main[i][j]=1;
// }
// if (j - 1 >= 0) {
// if (a[i][j - 1] - a[i][j] == 1) {
// main[i][j - 1] = main[i][j]+1;
// }
// }
// if (i - 1 >= 0) {
// if(i+1<n)
// {
// main[i][j] = main[i+1][j]+1;
// }
// if (a[i - 1][j] - a[i][j] == 1) {
// main[1 - 1][j] = main[i][j]+1;
// }
// }
// }
// }
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(a[i][j] + " ");
// }
// System.out.println();
// }
// System.out.println();
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(main[i][j] + " ");
// }
// System.out.println();
// }
// }
// }
package Knapsack;

import java.util.*;

public class Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int w[] = { 0, 1, 2, 3, 2 }; // Item weights
        int p[] = { 0, 20, 5, 10, 40 }; // Item profits
        int tc = 5; // Total capacity
        sc.close();

        int a[][] = new int[n + 1][tc + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= tc; j++) {
                if (w[i] <= j) {
                    int taken = a[i - 1][j - w[i]] + p[i];
                    int not_taken = a[i - 1][j];
                    a[i][j] = Math.max(taken, not_taken);
                } else {
                    a[i][j] = a[i - 1][j];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= tc; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Maximum profit: " + a[n][tc]); // Maximum profit
    }
}

// package Knapsack;
// import java.util.*;
// public class Knapsack {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int w[] = new int[n+1];
// int p[] = new int[n+1];
// for(int i = 1 ; i <= n ; i++)
// {
// w[i]=sc.nextInt();
// }
// for(int i = 1 ; i <=n ; i++)
// {
// p[i]=sc.nextInt();
// }
// int tc = sc.nextInt();
// sc.close();
// int a[][] = new int[n+1][tc+1];
// for(int i=1 ; i<= n ; i++)
// {
// for(int j =1 ; j<=tc ; j++)
// {
// // j is sack's capacity
// if(w[i]<=j)
// {
// int taken = a[i-1][j];
// int not_taken = a[i-1][j-w[i]]+p[i];
// a[i][j]=Math.max(taken, not_taken);
// }
// else
// {
// a[i][j]=a[i-1][j];
// }
// }
// }
// for(int i = 0;i<=n;i++)
// {
// for(int j = 0;j<=tc;j++)
// {
// System.out.print(a[i][j]+" ");
// }
// System.out.println();
// }
// System.out.print(a[n][tc]);
// }
// }
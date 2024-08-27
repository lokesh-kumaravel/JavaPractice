package DP;

public class RodCutting {
    public static void main(String[] args) {
        int[] l = {1,2,3,4,5,6,7,8};
        int[] p = {1,5,8,9,10,17,17,20};
        int n = 8;
        int[][] dp = new int[8+1][8+2];
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(l[i-1]<=j)
                {
                    int taken = dp[i-1][j];
                    int nottaken = dp[i][j-l[i-1]]+p[i-1];
                    dp[i][j] = Math.max(taken, nottaken);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n+1;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Final Output: "+dp[n][n]);
    }
}
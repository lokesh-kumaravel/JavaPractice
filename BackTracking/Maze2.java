// package BackTracking;

import java.util.Scanner;

public class Maze2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int[][] solution = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        s.close();
        boolean result = find(0,0,a,solution,n);
        if(result)
        {
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    System.out.print(solution[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("No solution exists");
        }
    }
    private static boolean find(int i,int j,int[][] a,int[][] solution,int n)
    {
        if(i==n-1&&j==n-1&&a[n-1][n-1]==0)
        {
            solution[i][j]=1;
            return true;
        }
        if(i>=0&&i<=n-1&&j>=0&&j<=n-1&&a[i][j]==0&&solution[i][j]==0)
        {
            solution[i][j]=1;
            if(find(i,j+1,a,solution,n))
            {
                return true;
            }
            if(find(i,j-1,a,solution,n))
            {
                return true;
            }
            if(find(i+1,j,a,solution,n))
            {
                return true;
            }
            if(find(i-1,j,a,solution,n))
            {
                return true;
            }
            solution[i][j]=0;
            return false;
        }
        return false;
    }
}

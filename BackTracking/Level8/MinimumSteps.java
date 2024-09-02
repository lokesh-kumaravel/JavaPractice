package Level8;

import java.util.*;
public class MinimumSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }
        scanner.close();
        int[][] solution = new int[n][2];
        int count = 0;
        backtrack(0,0,n,points,solution,count,0);
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<2;j++)
            {
                if(solution[i][j] == 1)
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
        System.out.println("-1");
        }
        else
        {
        System.out.println(count-1);
        }
    }
    public static int set = 1;
    public static boolean backtrack(int i,int j,int n,int[][] points,int[][] solution,int count,int value)
    {
        if(i==n-1&&j==1)
        {
            solution[i][j] = 1;
            return true;
        }
        if((i>=0&&i<n&&j>=0&&j<2&&solution[i][j] == 0&&points[i][j]==value+1)||(i>=0&&i<n&&j>=0&&j<2&&solution[i][j] == 0&&set==1))
        {
            set++;
            solution[i][j] = 1;
            if(backtrack(i+1,j,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i+1,j-1,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i-1,j,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i-1,j-1,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i,j+1,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i,j-1,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i+1,j-1,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            if(backtrack(i+1,j+1,n,points,solution,count,points[i][j]))
            {
                return true;
            }
            solution[i][j] = 0;
            return false;
        }
            return false;
    }
}
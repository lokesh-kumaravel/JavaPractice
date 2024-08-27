package Level8;

import java.util.*;
public class SavethePrincesses
{
    public static int[][] a = {
        { 0, 0, 0, 0, 0, 0 },
        { 1, 1, 0, 1, 0, 1 },
        { 1, 0, 0, 0, 0, 1 },
        { 1, 1, 1, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0 },
        { 1, 0, 0, 1, 1, 0 }
};
    public static void main(String[] args) 
    {
        int[][] solution = new int[6][6];
        check(0,0,solution);
        for(int i = 0;i<6;i++)
        {
            for(int j = 0;j<6;j++)
            {
                System.out.print(solution[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static boolean check(int i,int j,int[][] solution)
    {
        if(i==5&&j==5&&a[i][j]==0)
        {
            solution[i][j] = 1;
            return true;
        }
        else if(i>=0&&j>=0&&i<6&&j<6&&a[i][j]==0&&solution[i][j]==0)
        {
            solution[i][j] = 1;
            if(check(i-1, j, solution))
            {
                return true;
            }
            if(check(i, j+1, solution))
            {
                return true;
            }
            if(check(i+1, j, solution))
            {
                return true;
            }
            if(check(i, j-1, solution))
            {
                return true;
            }
            solution[i][j] = 0;
            return false;
        }
        return false;
    }
}
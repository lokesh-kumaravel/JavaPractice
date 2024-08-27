package DP;
public class IslandDP {
    public static int[][] a = {
        { 0, 0, 1, 0, 0, 0 },
        { 1, 1, 0, 1, 0, 1 },
        { 1, 0, 0, 0, 1, 1 },
        { 1, 1, 1, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0 },
        { 1, 0, 0, 1, 1, 1 }
};
public static int n = 6;
public static int[][] solution = new int[6+1][6+1];
    public static void main(String[] args) {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                find(i,j);
            }
        }
    for(int i = 0;i<n;i++)
    {
        for(int j = 0;j<n;j++)
        {
            System.out.print(solution[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static int find(int k,int l)
    {
        int count = 1;
        if(a[k][l]==0)
        {
            return 0;
        }
        else if(l-1>=0&&solution[k][l-1]>0)
        {
            solution[k][l] = solution[k][l-1];
        }
        else if(l-1>=0&&a[k][l-1]==0)
        {
            solution[k][l] = count++;
        }
        return 0;
    }
}
public class SubIsland {
    public static int c = 0;
    public static void main(String[] args) {
        int grid1[][] = {
            {1,1,1,0,0},
            {0,1,1,1,1},
            {0,0,0,0,0},
            {1,0,0,0,0},
            {1,1,0,1,1}
        };   
        int grid2[][] = {
            {1,1,1,0,0},
            {0,0,1,1,1},
            {0,1,0,0,0},
            {1,0,1,1,0},
            {0,1,0,1,0}
        };
            int n = 5;
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    if(grid2[i][j]!=grid1[i][j])
                    {
                        mark(i,j,grid1,grid2,n);
                    }
                }
            }
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(grid2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(c);
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(grid2[i][j]==1)
                {
                    count(i,j,grid2,n);
                    c++;
                }
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(grid2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(c);

    }
    private static boolean count(int i,int j,int[][] grid2,int n)
    {
        // if(i==n-1&&j==n-1)
        // {
        //     return true;
        // }
        if(i>=0&&i<n&&j>=0&&j<n&&grid2[i][j]==1)
        {
            grid2[i][j] = 0;
            if(count(i+1, j,grid2, n))
            {
                return true;
            }
            if(count(i-1, j, grid2, n))
            {
                return true;
            }
            if(count(i, j+1, grid2, n))
            {
                return true;
            }
            if(count(i, j-1, grid2, n))
            {
                return true;
            }
            // grid2[i][j] = 0;
            return false;
        }
        if(i==n-1&&j==n-1)
        {
            return true;
        }
        return false;
    }
    private static boolean mark(int i,int j,int[][] grid1,int[][] grid2,int n)
    {
        if(i>=0&&i<n&&j>=0&&j<n&&grid2[i][j]==1)
        {
            grid2[i][j] = 0;
            if(mark(i+1, j,grid1,grid2, n))
            {
                return true;
            }
            if(mark(i-1, j,grid1, grid2, n))
            {
                return true;
            }
            if(mark(i, j+1,grid1, grid2, n))
            {
                return true;
            }
            if(mark(i, j-1,grid1, grid2, n))
            {
                return true;
            }
            // grid2[i][j] = 0;
            return false;
        }
        if(i==n-1&&j==n-1)
        {
            return true;
        }
        return false;
    }
}

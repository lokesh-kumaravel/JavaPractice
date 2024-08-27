// import java.util.Scanner;

// public class Pixel {
//     public static int count = 0;

//     public static void main(String[] args) {
//         int n = 5;
//         int m = 6;
//         // int[][] a = {
//         //     {1,1,1,1,0,0},
//         //     {1,0,0,0,1,1},
//         //     {1,1,1,0,1,1},
//         //     {1,1,0,1,0,1},
//         //     {0,0,0,0,1,0}
//         // };
//         int[][] a = {
//                         {1,1,1,1,0,0},
//                         {1,0,0,0,1,1},
//                         {1,1,1,1,0,1},
//                         {1,1,0,1,0,1},
//                         {0,0,0,0,1,0}
//                     };
//         // Example start position
//         int startX = 1;
//         int startY = 1;

//         check(startX, startY, a);

//         System.out.println("Number of cells painted: " + count);

//         // Displaying the grid
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     private static boolean check(int i, int j, int[][] a) {
//         int n = 5, m = 6;
    
//         // Check if the current position is out of bounds or not paintable (not zero)
//         if (i < 0 || j < 0 || i >= n || j >= m || a[i][j] != 0) {
//             return false;
//         }
    
//         // Paint the current cell
//         a[i][j] = 2;
//         count++;
    
//         // Check all 8 directions including diagonals
//         if (check(i + 1, j, a)) {        // down
//             return true;
//         }
//         if (check(i - 1, j, a)) {        // up
//             return true;
//         }
//         if (check(i, j + 1, a)) {        // right
//             return true;
//         }
//         if (check(i, j - 1, a)) {        // left
//             return true;
//         }
//         if (check(i - 1, j + 1, a)) {    // top-right diagonal
//             return true;
//         }
//         if (check(i - 1, j - 1, a)) {    // top-left diagonal
//             return true;
//         }
//         if (check(i + 1, j - 1, a)) {    // bottom-left diagonal
//             return true;
//         }
//         if (check(i + 1, j + 1, a)) {    // bottom-right diagonal
//             return true;
//         }
    
//         // No more directions to check, return false
//         return false;
//     }
// }

import java.util.Scanner;

public class Pixel {
    public static int count = 0;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int m = 6;
        int[][] a = {
            {1,1,1,1,0,0},
            {1,0,0,0,1,1},
            {1,1,1,1,0,1},
            {1,1,0,1,0,1},
            {0,0,0,0,1,0}
        };
        check(1,1,a);
        {
            System.out.println(count);
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }   
    private static boolean check(int i,int j,int[][] a)
    {
        int n = 5,m = 6;
        if(i<0||j<0||i>=n||j>=m||a[i][j]!=0){
            return false;
        }
        else
        {
            a[i][j] = 2;
            count++;
            if (check(i + 1, j,a)) {
                return true;
            }
            if (check(i, j + 1,a)) {
                return true;
            }
            if (check(i - 1, j,a)) {
                return true;
            }
            if (check(i, j - 1,a)) {
                return true;
            }
            if (check(i-1, j + 1,a)) {
                return true;
            }
            if (check(i-1, j - 1,a)) {
                return true;
            }
            if (check(i+1, j - 1,a)) {
                return true;
            }
            if (check(i+1, j + 1,a)) {
                return true;
            }
            return false;
        }
    }
}
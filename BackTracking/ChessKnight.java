
// package BackTracking;
import java.util.*;

public class ChessKnight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt() - 1;
        int j = s.nextInt() - 1;
        int row = s.nextInt() - 1;
        int column = s.nextInt() - 1;
        int count = 0;
        s.close();
        int[][] a = new int[8][8];
        find(i, j, row, column, a, count);
        System.out.println(mincount);
    }

    static int mincount = Integer.MAX_VALUE;

    private static boolean find(int i, int j, int row, int column, int[][] a, int count) {
        if (i == row && j == column && a[i][j] == 0) {
            if (count < mincount) {
                mincount = count;
            }
        }
        if (i >= 0 && i <= 8 - 1 && j >= 0 && j <= 8 - 1 && a[i][j] == 0 && count < mincount) {
            a[i][j] = 1;
            if (find(i + 2, j + 1, row, column, a, count + 1)) {
                return true;
            }
            if (find(i + 2, j - 1, row, column, a, count + 1)) {
                return true;
            }
            if (find(i - 2, j + 1, row, column, a, count + 1)) {
                return true;
            }
            if (find(i - 2, j - 1, row, column, a, count + 1)) {
                return true;
            }
            if (find(i + 1, j + 2, row, column, a, count + 1)) {
                return true;
            }
            if (find(i + 1, j - 2, row, column, a, count + 1)) {
                return true;
            }
            if (find(i - 1, j + 2, row, column, a, count + 1)) {
                return true;
            }
            if (find(i - 1, j - 2, row, column, a, count + 1)) {
                return true;
            }
            a[i][j] = 0;
            return false;
        }
        return false;
    }
}

// package BackTracking;
// import java.util.*;
// public class ChessKnight {
// public static void main(String[] args)
// {
// Scanner s = new Scanner(System.in);
// s.close();
// int i = 7;
// int j = 7;
// int row = 0;
// int column = 0;
// int count = 1;
// int[][] a = new int[8][8];
// find(i,j,row,column,a,count);
// System.out.println(mincount-1);
// }
// static int mincount = Integer.MAX_VALUE;
// private static boolean find(int i,int j,int row,int column,int[][] a,int
// count)
// {
// if(i==row&&j==column&&a[i][j]==0)
// {
// if(count<mincount)
// {
// mincount = count;
// // for(int h = 0;i<row;h++)
// // {
// // for(int g = 0;g<column;g++)
// // {
// // a[h][g] = 0;
// // }
// // }
// // a[i][j] = 0;
// // return true;
// // return false;
// }
// // return false;
// }
// if(i>=0&&i<=8-1&&j>=0&&j<=8-1&&a[i][j]==0&&count<mincount)
// {
// a[i][j] = 1;
// if(find(i+2,j+1,row,column,a,count+1))
// {
// return true;
// }
// if(find(i+2,j-1,row,column,a,count+1))
// {
// return true;
// }
// if(find(i-2,j+1,row,column,a,count+1))
// {
// return true;
// }
// if(find(i-2,j-1,row,column,a,count+1))
// {
// return true;
// }
// if(find(i+1,j+2,row,column,a,count+1))
// {
// return true;
// }
// if(find(i+1,j-2,row,column,a,count+1))
// {
// return true;
// }
// if(find(i-1,j+2,row,column,a,count+1))
// {
// return true;
// }
// if(find(i-1,j-2,row,column,a,count+1))
// {
// return true;
// }
// a[i][j] = 0;
// return false;
// }
// return false;
// }
// }

import java.util.*;

public class Main {
    static int n;

    static boolean findPath(int i, int j, int a[][], int solution[][]) {
        if (i == n - 1 && j == n - 1 && a[n - 1][n - 1] == 0) // goal
        {
            solution[i][j] = 1;
            return true;
        }
        if (i >= 0 && j >= 0 && i < n && j < n && a[i][j] == 0) {
            solution[i][j] = 1;
            if (findPath(i, j + 1, a, solution))
                return true;
            if (findPath(i + 1, j, a, solution))
                return true;
            solution[i][j] = 0;
            return false;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = 5;
        int a[][] = {
                { 0, 0, 1, 1, 1 },
                { 1, 0, 0, 1, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0 }
        };
        int solution[][] = new int[n][n];
        if (findPath(0, 0, a, solution)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(solution[i][j] + " ");
                System.out.println();
            }
        } else
            System.out.print("No solution exists");
        sc.close();
    }
}
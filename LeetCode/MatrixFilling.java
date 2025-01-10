package LeetCode;

public class MatrixFilling {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] solution = new int[m][n];
        int index = 0;
        if (n * m < original.length || n * m > original.length) {
            return new int[0][0];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (index < original.length) {
                    solution[i][j] = original[index];
                    index++;
                } else {
                    break;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        MatrixFilling sol = new MatrixFilling();

        // Test case 1
        int[] original1 = { 1, 2, 3, 4, 5, 6 };
        int m1 = 2, n1 = 3;
        int[][] result1 = sol.construct2DArray(original1, m1, n1);
        System.out.println("Test case 1:");
        for (int[] row : result1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Test case 2
        int[] original2 = { 1, 2, 3 };
        int m2 = 1, n2 = 2;
        int[][] result2 = sol.construct2DArray(original2, m2, n2);
        System.out.println("Test case 2:");
        for (int[] row : result2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Test case 3
        int[] original3 = { 1, 2, 3, 4 };
        int m3 = 2, n3 = 2;
        int[][] result3 = sol.construct2DArray(original3, m3, n3);
        System.out.println("Test case 3:");
        for (int[] row : result3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Test case 4: Invalid case
        int[] original4 = { 1, 2 };
        int m4 = 2, n4 = 2;
        int[][] result4 = sol.construct2DArray(original4, m4, n4);
        System.out.println("Test case 4 (invalid case):");
        for (int[] row : result4) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

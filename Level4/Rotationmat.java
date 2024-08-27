package Level4;

import java.util.*;
public class Rotationmat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        int count = 0;
        for (char letter : str.toCharArray()) {
            if (letter == ']') {
                break;
            } else if (letter == ',') {
                count++;
            }
        }
        str = str.replace("[", "").replace("]", "");
        String[] a = str.split(",");
        count += 1;
        int d = 0;
        int[][] c = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                c[i][j] = Integer.parseInt(a[d++]);
            }
        }
        rotate(c);
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print("[");
            for (int j = 0; j < count; j++) {
                System.out.print(c[i][j]);
                if (j < c[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i < c.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
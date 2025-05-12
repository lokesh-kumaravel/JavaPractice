import java.util.*;

public class Xpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int height = 2 * (n - 1) + 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == i || j == height - 1 - i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
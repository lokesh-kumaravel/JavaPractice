
import java.util.Scanner;

public class Ncents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int M = scanner.nextInt();
            int[] coins = new int[M];
            for (int i = 0; i < M; i++) {
                coins[i] = scanner.nextInt();
            }
            int N = scanner.nextInt();
            int[][] dp = new int[M + 1][N + 1];
            for (int i = 0; i <= M; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= coins[i - 1]) {
                        dp[i][j] += dp[i][j - coins[i - 1]];
                    }
                }
            }
            for (int i = 0; i <= M; i++) {
                for (int j = 0; j <= N; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(dp[M][N]);
        }
        scanner.close();
    }
}
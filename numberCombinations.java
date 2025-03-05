public class numberCombinations {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] += dp[j - i];
            }
        }
        System.out.println("Output : " + dp[n]);
    }
}

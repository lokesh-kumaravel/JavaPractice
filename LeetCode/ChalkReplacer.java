package LeetCode;

public class ChalkReplacer {
    public static void main(String[] args) {
        int[] chalk = { 5, 1, 5 };
        int k = 22;
        System.out.println(chalkReplacer(chalk, k));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        int totalChalk = 0;
        for (int amount : chalk) {
            totalChalk += amount;
        }
        k %= totalChalk;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }
}
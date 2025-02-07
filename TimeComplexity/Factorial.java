package TimeComplexity;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int m = scanner.nextInt();
            List<Integer> result = findNumbersWithTrailingZeroes(m);
            System.out.println(result.size());
            for (int num : result) {
                System.out.print(num + " ");
            }
            if (result.size() != 0) {
                System.out.println();
            }
        }
        scanner.close();
    }

    private static List<Integer> findNumbersWithTrailingZeroes(int m) {
        List<Integer> result = new ArrayList<>();
        int low = 0;
        int high = 500000;
        while (low < high) {
            int mid = (low + high) / 2;
            int zeroes = countTrailingZeroes(mid);
            if (zeroes < m) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int first = low;
        while (countTrailingZeroes(first) == m) {
            result.add(first);
            first++;
        }
        return result;
    }

    private static int countTrailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
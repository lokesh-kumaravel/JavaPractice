package LeetCode;

public class XORinArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {
            {0, 1},
            {1, 2},
            {0, 3},
            {3, 3}
        };

        int[] result = xorQueries(arr, queries);

        System.out.println("Results of XOR Queries:");
        for (int res : result) {
            System.out.println(res);
        }
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] a = new int[queries.length];
        int k = 0;
        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            int result = arr[from];
            for (int j = from + 1; j <= to; j++) {
                result ^= arr[j];
            }
            a[k++] = result;
        }
        return a;
    }
}

package LeetCode;

public class findKthNumber {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        
        // Function to get the required number of gaps
        
        long num = 1;
        for (int i = 1; i < k;) {
            int req = getReqNum(num, num + 1, n);
            if (i + req <= k) {
                i += req;
                num++;
            } else {
                i++;
                num *= 10;
            }
        }
        
        System.out.println((int) num);
    }
    static int getReqNum(long a, long b, long n) {
        int gap = 0;
        while (a <= n) {
            gap += Math.min(n + 1, b) - a;
            a *= 10;
            b *= 10;
        }
        return gap;
    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxWidthRamp(int[] A) {
        List<Integer> s = new ArrayList<>();
        int res = 0, n = A.length;
        
        for (int i = 0; i < n; ++i) {
            if (s.size() == 0 || A[i] < A[s.get(s.size() - 1)]) {
                s.add(i);
            } else {
                int left = 0, right = s.size() - 1, mid = 0;
                while (left < right) {
                    mid = (left + right) / 2;
                    if (A[s.get(mid)] > A[i]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                res = Math.max(res, i - s.get(left));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {6, 0, 8, 2, 1, 5};
        int result = solution.maxWidthRamp(A);
        System.out.println("Maximum Width Ramp: " + result);
    }
}

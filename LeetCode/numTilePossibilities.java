package LeetCode;

public class numTilePossibilities {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String tiles = "AAB";
        int result = solution.numTilePossibilities(tiles);
        System.out.println("Number of tile possibilities: " + result);
    }

    static class Solution {
        public int numTilePossibilities(String tiles) {
            char[] arr = tiles.toCharArray();
            return permute(0, arr);
        }

        public int permute(int start, char[] arr) {
            if (start == arr.length)
                return 0;
            int ans = 0;
            for (int i = start; i < arr.length; i++) {
                if (!isPermutedBefore(start, i - 1, arr[i], arr)) {
                    System.out.println("Swapping start = " + start + " " + arr[start] + " and i = " + i + " " + arr[i]);
                    swap(start, i, arr);
                    System.out.println("Array after swap: " + new String(arr));
                    ans += 1 + permute(start + 1, arr);
                    System.out.println("Backtracking, swapping back " + arr[start] + " and " + arr[i]);
                    swap(start, i, arr);
                    System.out.println("Array after backtracking: " + new String(arr));
                }
            }
            return ans;
        }

        public boolean isPermutedBefore(int i, int j, char ch, char[] arr) {
            while (i <= j)
                if (arr[i++] == ch)
                    return true;
            return false;
        }

        public void swap(int i, int j, char[] arr) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

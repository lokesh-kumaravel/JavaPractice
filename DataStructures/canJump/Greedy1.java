package DataStructures.canJump;

public class Greedy1 {
    public static void main(String[] args) {
        // int[] a = { 2, 3, 1, 1, 4 };
        int[] a = { 3, 2, 1, 0, 4 };
        boolean ans = find(a);
        System.out.println(ans);
    }

    public static boolean find(int[] a) {
        int canreach = a[0];
        for (int i = 1; i < a.length; i++) {
            if (i > canreach) {
                return false;
            }
            canreach = Math.max(canreach, i + a[i]);
        }
        return true;
    }
}

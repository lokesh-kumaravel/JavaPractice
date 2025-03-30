package DataStructures.LemonadeChange;

public class BruteForce {
    public static void main(String[] args) {
        int[] bills = { 5, 5, 10, 10, 20 };
        boolean ans = find(0, new int[] { 0, 0 }, bills);
        System.out.println(ans);
    }

    public static boolean find(int index, int[] change, int[] bills) {
        if (index == bills.length) {
            return true;
        }
        int five = change[0];
        int ten = change[1];
        if (bills[index] == 5) {
            change[0]++;
            return find(index + 1, change, bills);
        }
        if (bills[index] == 10) {
            ten++;
            if (five > 0) {
                change[0]--;
                change[1]++;
                return find(index + 1, change, bills);
            } else {
                return false;
            }
        }
        if (five > 0 && ten > 0) {
            change[0]--;
            change[1]--;
            return find(index + 1, change, bills);
        } else if (five >= 3) {
            change[0] -= 3;
            return find(index + 1, change, bills);
        }
        return false;
    }
}

package DataStructures.LemonadeChange;

public class Backtracking {
    public static void main(String[] args) {
        int[] bills = { 5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5 };
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
            if (find(index + 1, change, bills)) {
                return true;
            }
            change[0]--;
        }
        if (bills[index] == 10) {
            if (five > 0) {
                change[0]--;
                change[1]++;
                if (find(index + 1, change, bills)) {
                    return true;
                }
                change[0]++;
                change[1]--;
            }
            return false;
        }
        if (five > 0 && ten > 0) {
            change[0]--;
            change[1]--;
            if (find(index + 1, change, bills)) {
                return true;
            }
            change[0]++;
            change[1]++;
        } else if (five >= 3) {
            change[0] -= 3;
            if (find(index + 1, change, bills)) {
                return true;
            }
            change[0] += 3;
        }
        return false;
    }
}

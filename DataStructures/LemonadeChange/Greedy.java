package DataStructures.LemonadeChange;

public class Greedy {
    public static void main(String[] args) {
        int[] a = { 5, 5, 5, 10, 20 };
        boolean ans = find(a);
        System.out.println(ans);
    }

    public static boolean find(int[] a) {
        int five = 0;
        int ten = 0;
        for (int i : a) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                ten++;
                if (five == 0) {
                    return false;
                } else {
                    five--;
                }
            } else if (i == 20) {
                if (five == 0) {
                    return false;
                } else if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
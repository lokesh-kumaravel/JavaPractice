package AutoDesk;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 3, 4, 1, 5, 1 };
        int count = 0;

        if (arr.length > 1) {
            int n1 = arr[0];
            int n2 = arr[1];

            for (int num : arr) {
                if (num != n1 && num != n2) {
                    count++;
                }
            }
        }

        System.out.println("Count of values not equal to 1st and 2nd number: " + count);
    }
}
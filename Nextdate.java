import java.util.*;

public class Nextdate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split("/");
        int day = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int year = Integer.parseInt(input[2]);

        int[] daysinmonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            daysinmonth[2] = 29;
        }

        day++;

        if (day > daysinmonth[month]) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.printf("%d/%d/%d\n", day, month, year);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}

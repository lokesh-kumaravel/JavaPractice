
import java.util.*;

public class NumberSpiral {
    static void numberSpiral(long Y, long X) {
        if (Y > X) {
            long ans = (Y - 1) * (Y - 1);
            long add;

            if (Y % 2 != 0) {
                add = X;
            } else {
                add = 2 * Y - X;
            }

            System.out.println(ans + add);
        } else {
            long ans = (X - 1) * (X - 1);
            long add;

            if (X % 2 == 0) {
                add = Y;
            } else {
                add = 2 * X - Y;
            }
            System.out.println(ans + add);
        }
    }

    public static void main(String[] args) {
        long Y = 2, X = 3;
        numberSpiral(Y, X);
    }
}
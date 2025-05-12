import java.util.*;

public class Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = words[i].toUpperCase();
            }
        }

        String result = String.join(" ", words);
        System.out.println(result);
    }
}

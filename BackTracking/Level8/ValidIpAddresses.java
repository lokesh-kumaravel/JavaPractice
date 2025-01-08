package Level8;

import java.util.*;

public class ValidIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restoreIp(s, 0, "", result, 0);
        return result;
    }

    private void restoreIp(String s, int start, String currentIp, List<String> result, int segment) {
        if (segment == 4 && start == s.length()) {
            result.add(currentIp);
            return;
        }

        if (segment == 4 || start == s.length()) {
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length())
                break;
            String part = s.substring(start, start + i);
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255)
                continue;
            restoreIp(s, start + i, currentIp + part + (segment == 3 ? "" : "."), result, segment + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ValidIpAddresses solution = new ValidIpAddresses();
        List<String> validIPs = solution.restoreIpAddresses(input);
        for (String ip : validIPs) {
            System.out.println(ip);
        }
    }
}

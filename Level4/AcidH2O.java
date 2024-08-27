package Level4;

import java.util.*;
public class AcidH2O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.nextLine();
        scanner.close();
        Map<String, Integer> atomCounts = countOfAtoms(formula);
        StringBuilder result = new StringBuilder();
        atomCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    result.append(entry.getKey());
                    if (entry.getValue() > 1) {
                        result.append(entry.getValue());
                    }
                });

        System.out.println(result.toString());
    }

    private static Map<String, Integer> countOfAtoms(String formula) {
        Deque<Map<String, Integer>> stack = new ArrayDeque<>();
        stack.push(new HashMap<>());
        int len = formula.length();
        for (int i = 0; i < len; ) {
            char ch = formula.charAt(i);
            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (ch == ')') {
                i++;
                int start = i;
                while (i < len && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int multiplier = (start < i) ? Integer.parseInt(formula.substring(start, i)) : 1;
                Map<String, Integer> top = stack.pop();
                Map<String, Integer> peek = stack.peek();
                for (String key : top.keySet()) {
                    peek.put(key, peek.getOrDefault(key, 0) + top.get(key) * multiplier);
                }
            } else {
                int start = i;
                i++;
                while (i < len && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }
                String element = formula.substring(start, i);
                start = i;
                while (i < len && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int count = (start < i) ? Integer.parseInt(formula.substring(start, i)) : 1;
                Map<String, Integer> peek = stack.peek();
                peek.put(element, peek.getOrDefault(element, 0) + count);
            }
        }
        return stack.pop();
    }
}

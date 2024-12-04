package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubfolders {
    public static void main(String[] args) {
        String[] folder = { "/a", "/a/b", "/c/d", "/c/d/e", "/c/f" };
        List<String> result = removeSubfolders(folder);
        System.out.println(result);
    }

    public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        for (String folders : folder) {
            if (result.isEmpty() || !folders.startsWith(result.get(result.size() - 1) + "/")) {
                result.add(folders);
            }
        }
        return result;
    }
}

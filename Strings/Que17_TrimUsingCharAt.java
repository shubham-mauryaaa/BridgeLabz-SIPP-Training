import java.util.*;

public class Que17_TrimUsingCharAt {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static int[] findTrimIndexes(String s) {
        int len = getLength(s);
        int start = 0;
        while (start < len && s.charAt(start) == ' ') start++;
        int end = len - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        int lenA = getLength(a);
        int lenB = getLength(b);
        if (lenA != lenB) return false;
        for (int i = 0; i < lenA; i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] indices = findTrimIndexes(input);
        String customTrimmed = customSubstring(input, indices[0], indices[1]);
        String builtinTrimmed = input.trim();
        boolean result = compareStrings(customTrimmed, builtinTrimmed);
        System.out.println("Custom Trim: " + customTrimmed);
        System.out.println("Built-in Trim: " + builtinTrimmed);
        System.out.println("Match: " + result);
    }
}

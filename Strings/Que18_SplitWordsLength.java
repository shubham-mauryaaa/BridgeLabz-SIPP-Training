import java.util.*;

public class Que18_SplitWordsLength {
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

    static String[] customSplit(String s) {
        int len = getLength(s);
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || s.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += s.charAt(j);
                words[idx++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    static String[][] wordLengthPairs(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] result = wordLengthPairs(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + len);
        }
    }
}

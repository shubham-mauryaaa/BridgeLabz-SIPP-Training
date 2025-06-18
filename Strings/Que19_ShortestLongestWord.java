import java.util.*;

public class Que19_ShortestLongestWord {
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

    static int[] findMinMaxIndex(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) {
                min = len;
                minIdx = i;
            }
            if (len > max) {
                max = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] lengths = wordLengthPairs(words);
        int[] minMax = findMinMaxIndex(lengths);
        System.out.println("Shortest Word: " + lengths[minMax[0]][0]);
        System.out.println("Longest Word: " + lengths[minMax[1]][0]);
    }
}

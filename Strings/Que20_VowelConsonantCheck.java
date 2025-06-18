import java.util.*;

public class Que20_VowelConsonantCheck {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeString(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkChar(c);
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Char\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] result = analyzeString(input);
        display(result);
    }
}

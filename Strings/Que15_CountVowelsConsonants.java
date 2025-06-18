import java.util.*;

public class Que15_CountVowelsConsonants {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not";
    }

    static int[] countVC(String s) {
        int[] count = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            String result = checkChar(s.charAt(i));
            if (result.equals("Vowel")) count[0]++;
            else if (result.equals("Consonant")) count[1]++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] result = countVC(s);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}

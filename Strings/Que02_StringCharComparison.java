import java.util.Scanner;

public class Que02_StringCharComparison {

    public static char[] getCharacters(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] userDefinedChars = getCharacters(input);

        char[] builtInChars = input.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("\nUser-defined character array:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray() result:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);
    }
}

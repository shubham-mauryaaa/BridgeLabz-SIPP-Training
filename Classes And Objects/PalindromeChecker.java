package OOps_Basic;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    void displayResult() {
        if (isPalindrome()) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("madam");
        checker.displayResult();
    }
}
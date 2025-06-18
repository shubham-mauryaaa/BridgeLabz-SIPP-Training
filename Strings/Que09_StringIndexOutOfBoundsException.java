import java.util.*;

public class Que09_StringIndexOutOfBoundsException {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            generateException(s);
        } catch (Exception e) {}
        handleException(s);
    }
}

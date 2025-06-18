import java.util.*;

public class Que08_NullPointerException {
    static void generateException() {
        String text = null;
        text.length();
    }

    static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {}
        handleException();
    }
}

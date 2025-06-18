import java.util.*;

public class Que11_LengthWithoutMethod {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int customLength = getLength(s);
        int builtInLength = s.length();
        System.out.println("Custom: " + customLength);
        System.out.println("Built-in: " + builtInLength);
    }
}

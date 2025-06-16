import java.util.Scanner;

public class Que20_ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        number = Math.abs(number);

        int maxDigits = 20;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number != 0 && index < maxDigits) {
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}

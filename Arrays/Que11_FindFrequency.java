import java.util.Scanner;

public class Que11_FindFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        number = Math.abs(number);

        int[] digits = new int[20];
        int index = 0;

        while (number > 0) {
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
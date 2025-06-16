import java.util.Scanner;
public class Que05_StoreMultipValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Maximum of 10 values reached.");
                break;
            }

            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("\nValues entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + numbers[i]);
        }

        System.out.printf("Total sum of values: %.2f\n", total);
    }
}

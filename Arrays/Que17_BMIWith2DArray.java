import java.util.Scanner;

public class Que17_BMIWith2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter positive numbers.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height); // BMI calculation

            double bmi = personData[i][2];
            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                " - Height: " + personData[i][1] + " m" +
                ", Weight: " + personData[i][0] + " kg" +
                ", BMI: " + String.format("%.2f", personData[i][2]) +
                ", Status: " + weightStatus[i]);
        }
    }
}

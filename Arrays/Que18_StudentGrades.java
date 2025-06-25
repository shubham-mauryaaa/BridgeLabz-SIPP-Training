import java.util.Scanner;

public class Que18_StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Step 2: Create arrays
        int[][] marks = new int[n][3]; // 0: Physics, 1: Chemistry, 2: Math
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Step 3: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Math";
                System.out.print(subject + ": ");
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                    j--; // Repeat this subject input
                    continue;
                }

                marks[i][j] = mark;
            }
        }

        // Step 4: Calculate percentage and assign grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            double p = percentages[i];
            if (p >= 80) grades[i] = 'A';
            else if (p >= 70) grades[i] = 'B';
            else if (p >= 60) grades[i] = 'C';
            else if (p >= 50) grades[i] = 'D';
            else if (p >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // Step 5: Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] +
                               ", Chemistry: " + marks[i][1] +
                               ", Math: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i] + "\n");
        }
    }
}

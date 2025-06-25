import java.util.Scanner;

public class Que19_EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Try again.");
                i--;
                continue;
            }

            System.out.print("Years of service: ");
            double service = scanner.nextDouble();
            if (service < 0) {
                System.out.println("Invalid years of service. Try again.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        for (int i = 0; i < 10; i++) {
            double bonus = yearsOfService[i] > 5 ? salaries[i] * 0.05 : salaries[i] * 0.02;
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Bonus Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

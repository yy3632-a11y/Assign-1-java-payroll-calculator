import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        double hourlyWage = 0.0;
        while (true) {
            System.out.print("Enter hourly wage: ");
            if (scanner.hasNextDouble()) {
                hourlyWage = scanner.nextDouble();
                if (hourlyWage >= 0) break;
                System.out.println("Hourly wage cannot be negative. Please try again.");
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }

        int hoursWorked = 0;
        while (true) {
            System.out.print("Enter hours worked: ");
            if (scanner.hasNextInt()) {
                hoursWorked = scanner.nextInt();
                if (hoursWorked >= 0) break;
                System.out.println("Hours worked cannot be negative. Please try again.");
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
        }

        double grossSalary = hourlyWage * hoursWorked;
        double tax = grossSalary * 0.20;
        double netSalary = grossSalary - tax;
        System.out.println("\nPayroll Summary for " + name);
        System.out.println("-----------------------------------");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Wage: $%.2f%n", hourlyWage);
        System.out.printf("Gross Salary: $%.2f%n", grossSalary);
        System.out.printf("Taxes Deducted: $%.2f%n", tax);
        System.out.printf("Net Salary: $%.2f%n", netSalary);

        scanner.close();
    }
}
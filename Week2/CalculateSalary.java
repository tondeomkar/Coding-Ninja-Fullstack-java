import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary and grade
        int basicSalary = scanner.nextInt();
        char grade = scanner.next().charAt(0);
        
        // Calculate HRA, DA, Allowance, PF
        double hra = 0.2 * basicSalary;
        double da = 0.5 * basicSalary;
        double allowance;
        
        switch (grade) {
            case 'A':
                allowance = 1700;
                break;
            case 'B':
                allowance = 1500;
                break;
            default:
                allowance = 1300;
                break;
        }
        
        double pf = 0.11 * basicSalary;

        // Calculate total salary
        double totalSalary = basicSalary + hra + da + allowance - pf;

        // Round off the total salary and print the integral part
        int roundedSalary = (int) Math.round(totalSalary);
        System.out.println(roundedSalary);

        scanner.close();
    }
}
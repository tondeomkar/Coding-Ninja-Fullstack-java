import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the principal amount as an integer
        int principal = scanner.nextInt();

        // Input the rate of interest as a decimal
        double rate = scanner.nextDouble();

        // Input the time period as an integer
        int time = scanner.nextInt();

        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the Simple Interest as an integer value
        System.out.println((int) simpleInterest);

        scanner.close();
    }
}

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        // Calculate the GCD using the Euclidean algorithm
        int gcd = calculateGCD(num1, num2);
        
        // Print the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
    
    // Function to calculate the GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}

/*
 * here's the flowchart for this process:

                  ┌────────────��──┐
                  │     Start     │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │ Input numbers │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │ Calculate GCD │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │   Print GCD   │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │    Stop       │
                  └───────────────┘
 */
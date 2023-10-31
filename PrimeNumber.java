import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the positive integer N
        System.out.println("Enter a positive integer N:");
        int N = scanner.nextInt();
        
        // Check if N is prime
        boolean isPrime = checkPrime(N);
        
        // Print the result
        if (isPrime) {
            System.out.println(N + " is a prime number");
        } else {
            System.out.println(N + " is not a prime number");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
/*
 * here's the flowchart for this process:

                  ┌───────────────┐
                  │     Start     │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │ Input N       │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │ Check if N is │
                  │     prime     │
                  └───────┬───────┘
                          │
                          ▼
            ┌───────────────────────┐
            │   if N <= 1, return   │
            │       false           │
            └───────────────────────┘
                          │
                          ▼
         ┌─────────────────────────────┐
         │ for i = 2 to sqrt(N)        │
         │     if N is divisible by i, │
         │         return false        │
         └─────────────────────────────┘
                          │
                          ▼
                  ┌───────────────┐
                  │  return true  │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │   Print result  │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │    Stop       │
                  └───────────────┘
 */
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the positive integer N
        System.out.println("Enter a positive integer N:");
        int N = scanner.nextInt();
        
        int sum = 0;
        
        // Calculate the sum of even numbers up to N
        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }
        
        // Print the sum
        System.out.println("The sum of even numbers up to " + N + " is: " + sum);
        
        scanner.close();
    }
}
/*
 * And here's the flowchart for this process:

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
                  │  Initialize   │
                  │    sum = 0    │
                  └───────┬───────┘
                          │
                          ▼
            ┌───────────────────────┐
            │  for i = 2 to N step 2 │
            │      sum = sum + i     │
            └───────────────────────┘
                          │
                          ▼
                  ┌───────────────┐
                  │   Print sum   │
                  └───────┬───────┘
                          │
                          ▼
                  ┌───────────────┐
                  │    Stop       │
                  └───────────────┘
 */
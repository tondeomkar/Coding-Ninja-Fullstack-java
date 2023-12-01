import java.util.*;
public class Solution {

  // public static void main(String [] args) {
  
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            // Input two numbers
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // Find and print the GCD
            int gcd = findGCD(num1, num2);
            System.out.println(gcd);
        }

        // Close the scanner
        scanner.close();
    }

}
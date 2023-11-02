import java.util.*;
public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            n /= 10;
        }

        System.out.println(evenSum + " " + oddSum);
	}
}

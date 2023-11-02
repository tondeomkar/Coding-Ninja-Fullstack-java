import java.util.*;
public class PowerOfNo {
    
    public static void main(String[] args) {
        // Write your code here
         Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        input.close();

        int result = 1;

        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            System.out.println("Invalid input for the power (n should be non-negative).");
            return;
        }

        System.out.println(result);
    }
}
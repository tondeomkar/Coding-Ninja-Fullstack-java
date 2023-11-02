import java.util.*;
public class Factors {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        if (n <= 1) {
            System.out.println("-1");
        } else {
            System.out.print("Factors of " + n + " excluding 1 and " + n + ": ");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
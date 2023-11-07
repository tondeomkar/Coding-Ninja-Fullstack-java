import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            char ch = (char) ('A' + i - 1); // Calculate the character to print on each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

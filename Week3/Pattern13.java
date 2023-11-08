import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (N): ");
        int N = sc.nextInt();
        sc.close();
        
        char currentChar = 'A';
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar);
                currentChar = (char)(currentChar + 1);
            }
            System.out.println();
            currentChar = (char)(currentChar - i);
        }
    }
}

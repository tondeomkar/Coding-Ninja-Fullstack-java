import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        int N = s.nextInt();// Change N to the desired number of rows

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

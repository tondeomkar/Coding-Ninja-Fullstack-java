import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        for (int fahrenheit = start; fahrenheit <= end; fahrenheit += step) {
            int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
            System.out.println(fahrenheit + " " + celsius);
        }

        scanner.close();
    }
}
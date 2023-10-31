import java.util.Scanner;

public class TriangleNature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        
        // Check if the triangle is equilateral
        if (side1 == side2 && side2 == side3) {
            System.out.println("1");
            System.out.println("Equilateral triangle");
        }
        // Check if the triangle is isosceles
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("0");
            System.out.println("Isosceles triangle");
        }
        // The triangle is scalene
        else {
            System.out.println("-1");
            System.out.println("Scalene triangle");
        }
        
        scanner.close();
    }
}
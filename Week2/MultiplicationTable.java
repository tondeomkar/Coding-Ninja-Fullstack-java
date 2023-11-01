import java.util.Scanner;

public class  MultiplicationTable{
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner (System.in);
	    int table = sc.nextInt();

	    int i = 1;
		
        while (i <= 10)
		{
             System.out.println(table*i);
             i = i + 1;
        }
	}
}
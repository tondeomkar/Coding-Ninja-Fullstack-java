import java.util.Scanner;
public class Binary_To_Decimal {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        int N=s.nextInt();
         int placeValue=1;
            int decimal=0;
        while(N!=0)
        {  
            int rem=N%10;
            decimal=decimal+(rem*placeValue);
             N=N/10;
         placeValue=placeValue*2;
        }
        System.out.println(decimal);

	}
}
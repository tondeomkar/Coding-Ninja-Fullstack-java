import java.util.Scanner;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        long binary=0;
        long prerev=0;
        long placeValue=1;
        while(N!=0)
        {
            int rem=N%2;
            binary=binary+rem*placeValue;
            N=N/2;
            placeValue*=10;
        }

        System.out.println(binary);
    }
}
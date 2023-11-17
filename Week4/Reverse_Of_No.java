import java.util.Scanner;
public class Reverse_Of_No {
	
	public static void main(String[] args) {
		// Write your code here
        int num,revnum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			revnum=revnum*10;
			revnum=revnum+num%10;
			num=num/10;
		}
		System.out.println(revnum);
		

	}
}
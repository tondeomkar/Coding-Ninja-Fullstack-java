
import java.util.*;
public class runner {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

		 int a,b;  
         for(a=1;a<=n;a++){  
           for(b=n;b>=1;b--){  
           if(b!=a)  
            System.out.print(b);  
            else  
             System.out.print("*");  
    }   
    System.out.println(""); 
	}
}
}
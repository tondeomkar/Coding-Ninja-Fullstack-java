import java.util.*;
public class Pattern18 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        int i = 1;
        
        while(i<= n){
            
        int j =1;
          while(j <= n-i){
            System.out.print(" ");
              j++;
        }
          int k = 1;
          while(k <= i ){
              System.out.print("*");
              k++;
          }
          int l = 1;
          while(l<=i-1){
              System.out.print("*");
              l++;
          }
          System.out.println();
          i++;
          
    }
	}

}
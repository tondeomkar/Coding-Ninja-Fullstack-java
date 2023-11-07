import java.util.Scanner;
public class Pattern11
 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		for (int i = 1; i <= N; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
			System.out.println();
	}
    }

}

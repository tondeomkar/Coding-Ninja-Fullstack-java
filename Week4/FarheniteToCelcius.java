public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		  // temperature in fahrenheit
            int i,C;
            for(i=start;i<=end;i=i+step)
			{
                C=((i-32)*5)/9;
                System.out.println(i+"\t"+C);
			}
	}
}
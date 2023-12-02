

public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here

        String minWord="";
        int prevSpace=0;
        input = " " + input + " ";
        for (int i=1;i<input.length();i++)
        {
            if (input.charAt(i) == ' ')
            {
                String word = input.substring(prevSpace+1,i);
                if (word.length() < minWord.length() || minWord.length() == 0)
                {
                    minWord=word;
                }
                prevSpace=i;
            }
        }
        return minWord;
	}
}
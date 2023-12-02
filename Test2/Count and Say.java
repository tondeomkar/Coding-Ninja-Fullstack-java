import java.util.*;
import java.io.*;
public class Solution {
    public static String writeAsYouSpeak(int n) {
        if (n <= 0) {
            return "";
        }

        // Base case: First term in the sequence is "1"
        String result = "1";

        // Generate the nth term by iterating through the sequence
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    // Increment count if the current character is equal to the previous one
                    count++;
                } else {
                    // Append count and the character to the result string
                    sb.append(count).append(result.charAt(j - 1));
                    // Reset count for the new character
                    count = 1;
                }
            }

            // Append the count and the last character
            sb.append(count).append(result.charAt(result.length() - 1));

            // Update result for the next iteration
            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5;
        String result = writeAsYouSpeak(n);
        System.out.println("The " + n + "th term of the Count and Say sequence is: " + result);
    }
}
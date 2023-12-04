import java.util.*;

public class Solution {
    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        // Sort the arrays to make the searching process more efficient
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        int minDifference = Integer.MAX_VALUE;

        while (i < n && j < m) {
            int currentDifference = Math.abs(arr1[i] - arr2[j]);

            // Update minDifference if the current pair has a smaller difference
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
            }

            // Move the pointers based on the comparison of elements
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 11, 17};
        int n = arr1.length;
        int[] arr2 = {4, 8, 10, 12, 14};
        int m = arr2.length;

        int minDifference = smallestDifferencePair(arr1, n, arr2, m);

        System.out.println("The smallest difference between a pair is: " + minDifference);
    }
}

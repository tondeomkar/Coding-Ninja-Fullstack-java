

import java.util.Scanner;
public class Solution {

    public static int[] merge(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergedLength = n1 + n2;

        int mergedArr[] = new int[mergedLength];

        int i = 0, j = 0, k = 0;

        // Merge elements of both arrays in sorted order
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            mergedArr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int mergedArr[] = merge(arr1, arr2);

        // Print the merged array
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
}

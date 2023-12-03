public class Solution {
    public static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int size = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        insertionSort(arr, size);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

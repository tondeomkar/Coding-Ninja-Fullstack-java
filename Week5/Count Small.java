public class Count Small {
    
}
// public class Solution {
//     public static int[] countS(int n, int m, int []a, int []b) {
//         // Write your code here.
//     }
// }
public class Solution {
    public static int[] countS(int n, int m, int[] a, int[] b) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (a[i] >= b[j]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] a = {2, 4, 8};
        int[] b = {1, 5, 3, 6, 2};

        int[] result = countS(n, m, a, b);

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

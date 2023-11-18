public class Solution {
    public static boolean checkMember(int n) {
        if (n <= 1) {
            return true;
        }

        int a = 1, b = 1;
        while (b < n) {
            int temp = b;
            b += a;
            a = temp;
        }

        return n == b;

    }
}
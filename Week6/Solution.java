import java.util.Scanner;

public class Solution {

    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void spiralPrint(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rs = 0, re = rows - 1, cs = 0, ce = cols - 1, c = 1;

        try {
            while (rs <= re && cs <= ce) {
                for (int j = cs; j <= ce; j++) {
                    System.out.print(matrix[rs][j] + " ");
                    c++;
                }
                rs++;

                for (int i = rs; i <= re; i++) {
                    System.out.print(matrix[i][ce] + " ");
                    c++;
                }
                ce--;

                if (rs <= re) {
                    for (int j = ce; j >= cs; j--) {
                        System.out.print(matrix[re][j] + " ");
                        c++;
                    }
                    re--;
                }

                if (cs <= ce) {
                    for (int i = re; i >= rs; i--) {
                        System.out.print(matrix[i][cs] + " ");
                        c++;
                    }
                    cs++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception handled.");
        }
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        spiralPrint(arr);
    }
}

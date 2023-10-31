import java.util.Scanner;
public class Solution {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch = str.charAt(0);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
 System.out.println(ch+"\n"+(a+b+c)/3);
 }
}
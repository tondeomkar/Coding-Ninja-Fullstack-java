import java.util.Scanner;
class Pattern15{
public static void main (String args[]){
int i,j;
int letter=64;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of rows: ");

int rows=scan.nextInt();
System.out.print("\nYour pattern here\n\n");
for(i=rows; i>=1; i--){
  for(j=rows; j>=i; j--){
  System.out.print((char)(j+letter));
}

System.out.println();
}
}
}
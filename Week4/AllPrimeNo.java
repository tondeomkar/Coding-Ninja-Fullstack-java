import java.util.Scanner;
public class AllPrimeNo {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int N=s.nextInt();
   int i;
    int d;
   
boolean flag;
        for(i=2;i<=N;i++)
        { flag=false;
           
            for(d=2;d<i;d++)
            {
                if(i%d==0)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println(i);
                
            }
            
        }
}}
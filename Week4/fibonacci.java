import java.util.Scanner;
public class fibonacci {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int N=s.nextInt();
   int i;
    int new_term=0;
    int t1=1;
    int t2=1;
   
    if(N==1)
    {
        new_term=1;
    }
    else if(N==2)
    {
        new_term=1;
    }
    else
    {
        for(i=3;i<=N;i++)
        {
            new_term = t1 + t2;
            t1 = t2;
            t2=new_term;
        }
        
        
    }

    System.out.println(new_term);
  
   
}
}
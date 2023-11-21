public class Solution {
    
    public static void arrange(int[] arr, int n) {
        int val=1, nVal=0;
     if(n!=0){
            if(n%2==0)
            nVal=n;
            else
            nVal=n-1;
         for(int j=0;j<=(n-1)/2;j++){
               arr[j]=val;
                val+=2;            
            }     
        for(int j=(((n-1)/2)+1);j<n;j++){
            arr[j]=nVal;
            nVal-=2;
        }
     }
    }
 }
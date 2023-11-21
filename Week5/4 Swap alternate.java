public class Solution{
    public static void swapAlternate(int arr[]){
    int temp=0,n=arr.length;
        for(int i=0;i<n-1;i+=2){
         temp=arr[i];
         arr[i]=arr[i+1];
         arr[i+1]=temp;
         }
    }
}
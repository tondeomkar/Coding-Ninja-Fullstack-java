
public class Solution {  

    public static void selectionSort(int[] arr) {
   for(int i=0;i<arr.length-1;i++)
   {    int minIndex=0;
       int min=Integer.MAX_VALUE;
       for(int j=i;j<arr.length;j++)
       {
           if(arr[j]<min)
           {
            min=arr[j];
            minIndex=j;   
           }
       }     
       int temp=arr[minIndex];
       arr[minIndex]=arr[i];
       arr[i]=temp;               
   }
}   
}
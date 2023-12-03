public class Solution {
    
    public static int search(int[] arr, int x) {
	int start=0;
    int end=arr.length-1;
   
    while(start<=end)
    {
         int mid=(end+start)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else{
                if(arr[mid]<x){
                    start =mid+1;
                    }
                else if(arr[mid]>x){
                    end=mid-1;
                    
                }       
            }     
    }
    return -1;
 }
}
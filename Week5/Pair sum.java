public class Solution {  

    public static int pairSum(int arr[], int x) {
    	int sum=0,temp=0,count=0;
        for(int i=0;i<arr.length;i++)
        { temp=arr[i];
		   for(int j=i+1;j<arr.length;j++)
           {
               if(temp+arr[j]==x)
               {
                   count ++;
               }
           }
        }return count;
    }
}
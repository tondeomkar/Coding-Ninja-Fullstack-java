public class Solution{  
    public static void intersections(int[] arr1, int[] arr2){
    
    int i = 0;   
        
	while(i<arr1.length)
    { int temp=arr1[i];
     boolean ans = false ;
          for(int j=0;j<arr2.length;j++)
          { 
            if(temp == arr2[j])
                     {
                        System.out.print(arr1[i]+" ");
						arr2[j]=Integer.MIN_VALUE;
                		break;
                    }
          } 
        i++;    
     }
  }
}
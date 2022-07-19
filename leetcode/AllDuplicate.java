import java.util.*;

class AllDuplicate{
    public static void main(String[] args) {
        int[] arr={5,2,2,1,1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr) {
        int n=arr.length,i=0;
          while(i<n)
          {
             int correctIndex=arr[i]-1;
               if (arr[i]!=arr[correctIndex])
             {
               int temp=arr[correctIndex];
               arr[correctIndex]=arr[i];
               arr[i]=temp;
             }     
             else 
	             i++;
	         
           }  
        
           List<Integer>al=new ArrayList<>();
           for (int index=0; index<n; index++)
             if(arr[index]!=index+1)
                al.add(arr[index]);
             
	    return al;
    }
 
}
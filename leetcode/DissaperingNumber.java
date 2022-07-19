import java.util.ArrayList;
import java.util.List;

public class DissaperingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,3,6,1,1};
        System.out.println(Dissapering(arr));
    }
    static List<Integer> Dissapering(int[] arr) {

        int i=0;
        while (i<arr.length){
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex]){
              swap(i,arr,correctindex);
            }
            else
                i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index< arr.length;index++){
             if(arr[index]!=index+1){
               ans.add(index+1);
                }
        }
    return ans;
    }
    
    static void swap(int i,int[] arr, int correctindex){
        int temp=arr[i];
        arr[i]=arr[correctindex];
        arr[correctindex]=temp;
    }
}


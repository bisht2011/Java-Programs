import java.util.Arrays;

class SetMismatch {
    public static void main(String[] args) {
        int[]arr = {4,2,1,2,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr) {
        
      int i = 0;

      while (i < arr.length) {
        int  correct = arr[i]-1;
          if (arr[i] != arr[correct]) {//sorting the array
              swap(i, arr, correct);
          } else
              i++;
      }

     for( int index=0;index< arr.length;index++){//displaying the result
if(arr[index]!=index+1)
    return new int[]{arr[index],index+1};
     }
     return new int[]{-1,-1};
  }
    static void swap(int i,int[] arr,int correct){
int temp=arr[i];
arr[i]=arr[correct];
arr[correct]=temp;
    }
}
 
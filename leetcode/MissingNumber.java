public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={5,0,2,1,3};
        System.out.println(missingnumber(arr));
    }

  static int missingnumber(int[] arr) {

      int i = 0;

      while (i < arr.length) {
        int  correct = arr[i];
          if (arr[i] < arr.length && arr[i] != arr[correct]) {//sorting the array
              swap(i, arr, correct);
          } else
              i++;
      }

     for( int index=0;index< arr.length;index++){//displaying the result
if(arr[index]!=index)
    return index;
     }
     return arr.length;
  }
    static void swap(int i,int[] arr,int correct){
int temp=arr[i];
arr[i]=arr[correct];
arr[correct]=temp;
    }
}

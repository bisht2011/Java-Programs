class Positive{
    public static void main(String[] args) {
        int[] arr={0,2,1,3};
        System.out.println(firstMissingPositive(arr));
    }

   static int firstMissingPositive(int[] arr) {
      int i = 0;
      while (i < arr.length) {
        int  correct = arr[i]-1;
          if (arr[i]>0 && arr[i] < arr.length && arr[i] != arr[correct]) {//sorting the array
              swap(i, arr, correct);
          } else
              i++;
      }

     for( int index=0;index< arr.length;index++){//displaying the result
if(arr[index]!=index+1)
    return index+1;
     }
     return arr.length+1;
  }
    static void swap(int i,int[] arr,int correct){
int temp=arr[i];
arr[i]=arr[correct];
arr[correct]=temp;
    }
}
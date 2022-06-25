import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = scan.nextInt();
//        System.out.println("enter the elements");//element should be in range of n
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }
        int[] arr={5,2,1,4,3};
        selectionsort(arr);
        System.out.println(Arrays.toString((arr)));

    }

    static void selectionsort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int last = arr.length - i - 1;
           int maxindex = MaxIndex(0,arr,last);
            swap(arr,last,maxindex);
        }
    }

    static void swap(int[] arr, int last, int i) {
        int temp=arr[i];
        arr[i]=arr[last];
        arr[last]=temp;
    }

    static int MaxIndex(int start, int[] arr, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
          if(arr[i]>arr[max])
              max=i;

        }
        return max;
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = scan.nextInt();
//        System.out.println("enter the elements");//element should be in range of n
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }
        int[] arr={4,2,3,5,1};
        insertionsort(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
         for(int j=i+1 ; j>0 ; j--){
             if(arr[j]<arr[j-1]){
                 swap(arr,j,j-1);
             }
             else
                 break;
         }

    }
}
     static void swap(int[] arr, int j, int k) {
         int temp=arr[j];
         arr[j]=arr[k];
         arr[k]=temp;
     }
    }

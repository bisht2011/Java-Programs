import java.util.Arrays;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
       int n= scan.nextInt();
        System.out.println("enter the elements");//element should be in range of n
        int[] arr=new int[n];
        for(int i =0;i< arr.length;i++){
            arr[i]= scan.nextInt();
        }
        cyclicsort(arr);
        System.out.println(Arrays.toString((arr)));
    }

     static void cyclicsort(int[] arr) {
int i=0;
        while (i<arr.length){

           int correctindex=arr[i]-1;

          if(i!=correctindex){

              int temp=arr[i];

             arr[i]=arr[correctindex];

              arr[correctindex]=temp;

          }
          else
              i++;


        }

     }
}

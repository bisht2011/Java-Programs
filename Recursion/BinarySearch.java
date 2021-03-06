import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("enter the target you want to find");
        int target = scan.nextInt();
        int start=0,end=arr.length-1;
        int ans=binary(arr,start,end,target);
        System.out.println(ans);
        if(ans==-1){
            System.out.println("not found");
        }
        else
            System.out.println("found at the index" + ans);
  }

     static int binary(int[] arr, int start, int end, int target) {
        int mid=start + (end-start)/2;

         if(start>end)//base condition
             return -1;
        if(target==arr[mid])
            return mid;
        else if(target<arr[mid])
            return binary(arr,start,mid-1,target);
        else
            return binary(arr,mid+1,end,target);

    }
}

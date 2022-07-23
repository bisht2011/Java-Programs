import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArrayK {
    public static void main(String[] args) {
        int[] arr={2,3,-1,5,2,1};
        int k=3;
        System.out.println(ans(arr,k));
        System.out.println(ans1(arr,k));
    }

    static int ans1(int[] arr, int k) {//optimal solution
        ArrayList<Integer>al=new ArrayList<>();//sliding window
        int sum=0,min_sum=0;
        for(int i=0;i<k;i++){
           min_sum+=arr[i];
           al.add(arr[i]);
        }
        System.out.println(al);
        for(int i=k;i<arr.length;i++){
            min_sum+=arr[i]-arr[i-k];
            sum=Math.max(sum,min_sum);
        }
        return sum;
    }

    static int ans(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<=arr.length-k;i++){
            int min_sum=0;
            for(int j=i;j<i+k;j++){
                min_sum+=arr[j];
            }
            sum=Math.max(min_sum,sum);
        }
        return sum;
    }
}

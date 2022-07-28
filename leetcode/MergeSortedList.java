import java.util.Arrays;

public class MergeSortedList {
    public static void main(String[] args) {
        int[] arr1={1,2,5,0,0,0};
        int[] arr2={2,4,6};
        ans(arr1,arr2,3,3);
    }

    private static void ans(int[] nums1, int[] nums2,int m,int n) {
        int j =0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}

import java.util.HashMap;

public class SubArraySumTarget {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int k = 3;
        System.out.println(subarraySum(nums, k));
        System.out.println(subarraySumusinghashpmap(nums,k));
    }

    private static int subarraySumusinghashpmap(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,c=0;
        map.put(0,1);
        for (int num : nums) {
            sum += num;
            int req = sum - k;
            if (map.containsKey(req))
                c += map.get(req);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            System.out.println(req+" " +map.get(req));
        }
        return c;
        }



    static int subarraySum(int[] arr, int k) {

        int n = arr.length;
        int res = 0;

        // calculate all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) { //12121
                // calculate required sum
                sum += arr[j];
                // check if sum is equal to required sum
                if (sum == k)
                    res++;
            }
        }
        return res;
    }
}
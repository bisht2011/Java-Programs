import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11};
        int target = 16;
      System.out.println(Arrays.toString(twosum(arr, target)));
//        System.out.println(Arrays.toString(twosum1(arr, target)));
    }

    static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (!map.containsKey(complement)) {
                map.put(nums[i], i);
            }
            else
                return new int[]{map.get(complement), i};
        }

        return new int[]{-1,-1};
    }
    static int[] twosum1(int[]nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){

            if(target==nums[s]+nums[e])
                return new int[]{s,e};
            if(target>nums[s]+nums[e])
                s++;
            else
                e--;
        }
        return new int[]{-1,-1};
    }
}
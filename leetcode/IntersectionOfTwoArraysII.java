import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(sol(nums1, nums2)));
    }
    static int[]sol(int[] nums1, int[]nums2){
    List<Integer> output = new ArrayList<>();
        for (int k : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums2[j]) {
                    output.add(k);
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return output.stream()
                .mapToInt(Integer::intValue)
                        .toArray();
}
//    HashMap<Integer, Integer> map = new HashMap<>();
//    int i;
//        for(i = 0; i < nums1.length; i++){
//
//        map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
//    }
//
//    List<Integer> output = new ArrayList<>();
//        for(i = 0; i < nums2.length; i++){
//
//        int curr = nums2[i];
//        if(map.containsKey(curr) && map.get(curr) != 0){
//            output.add(curr);
//            map.put(curr, map.get(curr)-1);
//        }
//    }
//    int[] arr= new int[output.size()];
//    for(int k=0;k<arr.length;k++){
//        arr[k]=output.get(k);
//    }
}

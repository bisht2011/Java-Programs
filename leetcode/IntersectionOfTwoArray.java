import java.util.*;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        System.out.println(Arrays.toString(sol(nums1, nums2)));
    }

    private static int[] sol(int[] nums1, int[] nums2) {
        ArrayList<Integer>al= new ArrayList<>();
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        for (int j:nums2){
            hs2.add(j);
        }
        hs1.retainAll(hs2);
        int [] output = new int[hs1.size()];
        int idx = 0;
        for (int s : hs1)
            output[idx++] = s;
        return output;           //return hs1.stream().mapToInt(Integer::intValue).toArray();
    }
//    ArrayList <Integer> ansList = new ArrayList<>(); //ArrayList to store the answer
//
//        for(int i = 0; i<nums1.length; i++){  //Runs through the first array
//        for(int j = 0; j<nums2.length; j++){ //Runs through the second array
//            if(nums1[i] == nums2[j]){
//                if(ansList.contains(nums1[i]) == false){
//                    ansList.add(nums1[i]);
//                    break;
//                }
//            }
//        }
//    }
//
//    int [] ans = new int[ansList.size()]; //Creates the answer array and fills it with the ArrayList
//        for(int i = 0; i<ans.length; i++) {
//        ans[i] = ansList.get(i);
//    }
//        return ans;
}

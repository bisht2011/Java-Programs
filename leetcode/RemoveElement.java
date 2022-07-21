public class RemoveElement {
    public static void main(String[] args) {
int[] arr={2,3,2,1};
int val=3;
        System.out.println(removeElement(arr,val));
    }

    static int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c++] = nums[i];

            }
        }
        return c;
    }
}
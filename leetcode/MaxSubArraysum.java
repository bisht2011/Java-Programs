public class MaxSubArraysum {
    public static void main(String[] args) {
        int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {//kadane algorithm
        int maxValue = nums[0], sum = 0;
        for (int n : nums) {
            sum += n;
            if (sum >= maxValue) {
                maxValue = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxValue;
    }
    private static int calc(int[] arr) {//brute force
        int result=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i;j< arr.length;j++){
                result=Math.max(result,temp); //to calculate max subarray
                temp+=arr[j];
            }
            result=Math.max(result,temp);
        }
        return result;
    }
}
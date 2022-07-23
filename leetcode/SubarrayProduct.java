public class SubarrayProduct {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,1};
        System.out.println(Subarray(arr));
        System.out.println(maxProduct(arr));
    }

    static int Subarray(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {//brue force calculate all the subarray product and then max out
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                result = Math.max(result, min);
                min *= arr[j];
            }
            result = Math.max(result, min);
        }

        return result;
    }

    static int maxProduct(int[] arr) {
        int n=arr.length;
        int minVal = arr[0];
        int maxVal = arr[0];

        int maxProduct = arr[0];

        for (int i = 1; i < n; i++)    //-1,2,-4
        {

            // When multiplied by -ve number,
            // maxVal becomes minVal
            // and minVal becomes maxVal.
            if (arr[i] < 0)
            {
                int temp = maxVal;
                maxVal = minVal;
                minVal =temp;

            }

            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            // Max Product of array.
            maxProduct = Math.max(maxProduct, maxVal);
        }

        // Return maximum product found in array.
        return maxProduct;
    }
}
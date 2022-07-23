public class SubArrayProductPair {
    public static void main(String[] args) {
        int[] arr = {1, -4, -3, 6};
        int n = arr.length;
        maxProduct(arr, n);

    }
    static void maxProduct(int[] arr, int n) {
        if (n < 2) {
            System.out.println("No pairs exists");
            return;
        }

        if (n == 2) {
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }

        // Initialize maximum and second maximum
        int posa = Integer.MIN_VALUE,
                posb = Integer.MIN_VALUE;
        // Traverse given array
        for (int i = 0; i < n; i++) {
            // Update maximum and second maximum
            // if needed
            if (arr[i] > posa) {
                posb = posa;
                posa = arr[i];
            } else if (arr[i] > posb)
                posb = arr[i];

            // Update minimum and second minimum
            // if needed
        }
            System.out.println("Max product pair is {"
                    + posb + ", " + posa + "}");
    }
}


public class SumOfAllSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(calc(arr));
    }

    private static int calc(int[] arr) {
        int result=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i;j< arr.length;j++){
                temp+=arr[j];
                result += temp ;
            }
        }
       return result;
    }
}

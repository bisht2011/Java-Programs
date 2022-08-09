public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 14;
        System.out.println(ans(arr,target,0,arr[0].length-1));
    }

    private static boolean ans(int[][] arr, int target, int start, int end) {
        while(start < arr.length && end >= 0){
            if(arr[start][end]==target)
                return true;
            else if(arr[start][end]>target)
                end--;
            else
                start++;
        }
        return false;
    }
}

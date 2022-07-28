public class RemoveElementFromSortedArray {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(arr));
    }

    private static int remove(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[i-count+1]=arr[i+1];
            }else count++;
        }
        return arr.length-count;
    }
}

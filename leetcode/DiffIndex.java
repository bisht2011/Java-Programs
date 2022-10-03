import java.util.Arrays;

public class DiffIndex {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5};
        int k=2;
        int length=5;
        System.out.println(indexdiff(arr,k,length));
    }

    private static int indexdiff(int[] arr, int k, int length) {
        int index1=0;
        int index2=0;
        int result=0;
        for (int i=0;i<length;i++){
            if(arr[i]==k){
                index1=i;
            }
        }
        Arrays.sort(arr);
        for (int i=0;i<length;i++){
            if(arr[i]==k){
                index2=i;
            }
        }
        result=Math.abs(index1-index2);
        return result;
    }
}

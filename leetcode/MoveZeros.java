import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={0,3,0,1,12};
        move(arr);
    }

    private static void move(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        while(count< arr.length){
            arr[count]=0;
            count++;
        }

    }
}

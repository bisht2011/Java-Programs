import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t, j,count=0;

        System.out.println("enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int size = arr.length;

        for (int i = 0; i < arr.length-1; i++) {
            for (j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j] && j< arr.length-count-1) {
                    int temp = arr[j];//swapping to the last index
                    arr[j] = arr[arr.length - count - 1];
                    arr[arr.length - count - 1] = temp;
                    count++;
                }

                }

//        for (int i = 0; i < size; i++) {
//            for ( j = i + 1; j < size; j++)
//                if (arr[i] == arr[j]) {
//                    for (t = j; t < size-1; t++) {
//                        arr[t] = arr[t + 1];
//                    }
//                    size--;
//                    j--;
//                }
//        }
        for(int i = 0; i < size-count; i++) {
            System.out.println(arr[i]);
        }
    }
}



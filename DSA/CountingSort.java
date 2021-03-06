import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scan.nextInt();
        System.out.println("enter the elements");//element should be in range of n
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

            System.out.println(Arrays.toString(countingsort(arr)));

    }

    static int[] countingsort(int[] arr) {
        int max=0;
        int sum=0;
        int[] outputArr = new int[arr.length];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        int[] freqArr = new int[max+1];
        int[] sumArr = new int[freqArr.length];

        for(int i=0;i<arr.length;i++){
            freqArr[arr[i]]++;
        }

        for(int i = 0 ; i < freqArr.length ; i++){
            sum+= freqArr[i];
            sumArr[i] = sum;
        }

        for(int i=0;i<arr.length;i++){
            sumArr[arr[i]]--;
            outputArr[sumArr[arr[i]]]=arr[i];
        }

        return outputArr;
    }

        }




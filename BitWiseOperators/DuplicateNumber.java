import java.util.*;


public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Duplicate(arr));
    }

     static List<Integer> Duplicate(int[] arr) {
         Arrays.sort(arr);
         List<Integer>al=new ArrayList<>();
         for(int i=0;i<arr.length-1;i++){
             if((arr[i]^arr[i+1])==0){
                 al.add(arr[i]);
             }
         }
         return al;
    }
}

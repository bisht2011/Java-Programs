public class BinarySea {
    static int[] a = {10,15,24,27,33,54};
    public static void main(String[] args) {
        int search=33;
        binar(search);
    }

    static void binar(int search) {
        int low=0;
        int high=a.length-1;
        while(low<=high){
           int mid= low + (high - low)/2;
           if(search==a[mid]){
               System.out.println("found");
               break;
           }
           else if(search<a[mid]){
               high=mid-1;
           }
           else
               low=mid+1;
        }
        if(low>high)
            System.out.println("not found");
    }
}

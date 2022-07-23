import java.util.Arrays;

public class MixSorting {
    public static void main(String[] args) {
        int[]arr = {5,4,1,2,3};

        merge(arr,0,arr.length);
//        bubble(arr);
//        insertion(arr);
//        selection(arr);
//        cycle(arr);
//        counting(arr);
        System.out.println(Arrays.toString((arr)));

    }

    private static void merge(int[] arr,int s,int e) {
        if(e-s==1){
            return ;
        }

        int mid= (e+s)/2;
     merge(arr,s,mid);
     merge(arr,mid,e);

       merging(arr,s,e,mid);

    }

    private static void merging(int[] arr,int s, int e,int mid) {
        int[]arr2 = new int[e-s];
        int i=s,j=mid,k=0;
        while(i< mid&&j< e){
            if(arr[i]< arr[j]){
                arr2[k]=arr[i];
                i++;
            }
            else {
                arr2[k]=arr[j];
            j++;
            }
            k++;
        }
        while(i < mid){//copying the left over elements in each array
            arr2[k]= arr[i];
            i++;
            k++;
        }
        while(j < e){
            arr2[k]= arr[j];
            j++;
            k++;
        }
        System.arraycopy(arr2, 0, arr, s , arr2.length);
    }

    private static void counting(int[] arr) {
int[]output = new int[arr.length];
int max=0;
for(int i:arr){
    if(i>max)
        max=i;
}
int[] freq=new int[max+1];
int[] sumarr=new int[freq.length];
for(int i=0;i< arr.length;i++){
    freq[arr[i]]++;
}
int sum=0;
for(int i=0;i< freq.length;i++){
    sum+=freq[i];
    sumarr[i]=sum;
}
        for(int i=0;i<arr.length;i++){
            sumarr[arr[i]]--;
            output[sumarr[arr[i]]]=arr[i];
        }
        for(int num:output)
            System.out.print(num);
    }

    private static void cycle(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int current_index = arr[i] - 1;
            if(arr[i]!=arr[current_index]){
                swap(arr,i,current_index);
            }
            else i++;

        }
        for(int num:arr)
            System.out.print(num);
    }

    static void selection(int[] arr) {
        for(int i=0;i< arr.length;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        for(int num:arr)
            System.out.print(num);
    }

    static void insertion(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else
                    break;
            }
        }
        for(int num:arr)
            System.out.print(num);
    }

    static void bubble(int[] arr) {
        int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=1;
                }
            }
            if(flag==0)
                break;

        }for(int num:arr)
         System.out.print(num);
    }
    static void swap(int[] arr, int j, int k) {
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
}

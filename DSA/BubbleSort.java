import  java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
       int[] a = {10,23,43,12,44};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

     static void bubble(int[] a) {
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=1;
                }

            }
            if(flag==0)
                break;
        }

         }
    }


package com.company;

public class agnosticbinarysearch {
    public static void main(String[] args) {
        int arr[]={-20,-14,9,40,70,310,366,400};
//        int arr[]={ 10,9,2,-9,-23,-44};
        int target=40;
        System.out.println(searchin(arr,target));
    }

    static int searchin(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1 ;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {// for ascending array

                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
//            else//for descending array
//            {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                }
//                else {
//                    start = mid + 1;
//                }
//
//
            }

//        }
        return -1;
    }

}

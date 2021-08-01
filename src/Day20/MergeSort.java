package Day20;

import utilities.Basic;

public class MergeSort {
    public  static void merge(int [] a, int start, int end){
        int [] x = new int[end-start+1];
        int mid = (start+end)/2;
        int low = start;
        int index = 0;
        int index2 = mid+1;
        while (index2<=end && start<=mid){
            if(a[index2]<=a[start])
                x[index++] = a[index2++];
            else
                x[index++] = a[start++];
        }
        if(index2 <= end){
            for(int i = index2;i<=end;i++)
                x[index++] = a[i];
        }
        else {
            for (int i = start; i <=mid; i++)
                x[index++] = a[i];
        }
        for(int i = 0; i<x.length;i++){
            a[low++] = x[i];
        }
    }
        public static void merge_sort(int arr[],int start, int end){
            if(start>=end){
                return;
            }
            int mid = (start+end)/2;
            merge_sort(arr,start,mid);
            merge_sort(arr,mid+1,end);
            merge(arr,start,end);

    }

    public static void main(String[] args) {
        int [] testcase1 = new int[]{20,-18,3,7,4};
        merge_sort(testcase1,0,testcase1.length-1);
        System.out.println();
        Basic.printArray(testcase1,testcase1.length);
    }
}

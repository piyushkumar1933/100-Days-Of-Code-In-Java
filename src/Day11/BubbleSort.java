package Day11;

import utilities.Basic;

public class BubbleSort {
    public static void swap(int[] arr,int i,int j){
        if(i==j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int arr[]){
        // Comparing the consecutive element and ith highest element at end
        int n =arr.length;
        for(int i = 0;i<n-1;i++){
            for (int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }
    public static void main(String[] args) {
        int testcase1[] = new int[]{9, 12, 7, 5, 4, 7, 1, 3, 0};
        bubbleSort(testcase1);
        Basic.printArray(testcase1,testcase1.length);
    }
}

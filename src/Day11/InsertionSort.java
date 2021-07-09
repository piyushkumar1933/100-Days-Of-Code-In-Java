package Day11;

import utilities.Basic;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        //Moving its element to correct position
        int n = arr.length;
        for(int i = 1; i<n;i++){
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int testcase1[] = new int[]{9, 20, 7, 1, 4, 7, 1, 3, -6};
        insertionSort(testcase1);
        Basic.printArray(testcase1,testcase1.length);
    }
}

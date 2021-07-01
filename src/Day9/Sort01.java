/*
Sort 0 1

You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
 Write a function to sort this array/list.
Think of a solution which scans the array/list only once and don't require use of an extra array/list.
 */
package Day9;

import utilities.Basic;

import java.util.prefs.BackingStoreException;

public class Sort01 {
    public static void swap(int arr[],int i,int j){
        if(i==j){
            return;
        }
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
    public static int [] sort01(int arr[]){
        int zeropoint = -1;
        for(int onepointer = 0; onepointer<arr.length;onepointer++){
            if(arr[onepointer]==0){
                zeropoint++;
                swap(arr,onepointer,zeropoint);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] testcase1 = new  int []{1, 0, 1, 1, 0, 1, 0, 1};
        int [] testcase2 = new  int []{0 ,1, 1, 0, 1, 0 ,1};
        int[] output = sort01(testcase1);
        Basic.printArray(output,output.length);
        System.out.println();
        output= sort01(testcase2);
        Basic.printArray(output,output.length);
    }
}

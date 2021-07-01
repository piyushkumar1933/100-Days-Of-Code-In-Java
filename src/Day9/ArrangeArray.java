/*
Arrange Numbers in Array

You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
 */
package Day9;

import utilities.Basic;

import java.util.BitSet;

public class ArrangeArray {
    public static int [] arrange(int n){
        int [] arr = new int[n];
        int index = 0;
        int last = n-1;
        int value = 1;
        while (index < last){
            arr[index] = value;
            value++;
            index++;
            arr[last] = value;
            last--;
            value++;
        }
        if(index == last){
            arr[index] = value;
        }
        return arr;
    }
    public static int[] arrange2(int n){
        int arr[] = new int[n];
        int value = 1;
        boolean flag = true;
        for (int i =0; i<n;i++){
            if(i<=(n-1)/2){
                arr[i] = value;
                value+=2;
            }

            else {
                if(n%2 == 0 && flag) {
                    value = n;
                    flag = false;
                }
                if(flag && n%2!=0) {
                    value = n - 1;
                    flag = false;
                }
                arr[i] = value;
                value-=2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] testcase1 = arrange(6);
        Basic.printArray(testcase1,testcase1.length);
        testcase1 = arrange2(6);
        System.out.println();
        Basic.printArray(testcase1,testcase1.length);
        int [] testcase2 = arrange(5);
        System.out.println();
        Basic.printArray(testcase2,testcase2.length);
        System.out.println();
        testcase2 = arrange2(5);
        Basic.printArray(testcase2,testcase2.length);
    }
}

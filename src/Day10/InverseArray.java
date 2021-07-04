package Day10;

import utilities.Basic;

public class InverseArray {
    public static  void swap(int[] arr,int i ,int j){
        if(i == j){
            return;
        }
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void inverseArray(int[] arr){
        int n = arr.length;
        int a[] = new int [n];
        for(int i = 0; i<n;i++){
            int j = arr[i];
            a[j] = i;
        }
        Basic.printArray(a,n);
    }
    public static void inv(int arr[]){
        int n = arr.length;
        int temp [] = new int[n];
        for (int i = 0; i<n;i++){
            int key = i;
            int j = 0;
            while (key!=arr[j]){
                j++;
            }
            temp[i] = j;
        }
        Basic.printArray(temp,temp.length);
    }
    public static void main(String[] args) {
        int testcase[] = new int[]{3,4,1,2,0};
        inverseArray(testcase);
        System.out.println();
        inv(testcase);
    }
}

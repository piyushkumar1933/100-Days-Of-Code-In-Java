package Day21;

import utilities.Basic;

public class QuickSort {
    public static void quickSort(int[]arr,int si,int ei){
        if(si>=ei)
            return;
        int pivotPos = partition(arr,si,ei);
        quickSort(arr,si,pivotPos-1);
        quickSort(arr,pivotPos+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = si;
        int small = 0;
        for(int i = si+1; i<=ei;i++){
            if(arr[pivot]>=arr[i])
                small++;
        }
        swap(arr,pivot,si+small);
        pivot = si+small;
        int i = si;
        int j = ei;
        while (i<pivot && j>pivot){
            if(arr[i]<=arr[pivot]){
                i++;
            }
            else if(arr[j]>arr[pivot]){
                j--;
            }
            else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot;
    }
    public static void swap(int []arr, int i,int j){
        if(i == j)
            return;
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }

    public static void main(String[] args) {
        int [] testcase = new int[]{-12,4,9,1,4,7};
        quickSort(testcase,0,5);
        Basic.printArray(testcase,testcase.length);
    }
}

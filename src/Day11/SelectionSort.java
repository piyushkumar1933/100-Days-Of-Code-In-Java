package Day11;

import utilities.Basic;

public class SelectionSort {
    public static void selectionSort(int []a){
        //In selection sort minimum is swapped with index
        int n = a.length;
        for(int i = 0; i<n-1;i++){
            int min = i;
            for (int j = i;j<n;j++){
                if(a[j]<a[min])
                    min = j;
            }
            System.out.println(a[min]);
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
//            a[i] = a[i]^a[min];
//            a[min] = a[i]^a[min];
//            a[i] = a[i]^a[min];
        }
    }
    public static void main(String[] args) {
        int testcase1[] = new int[]{0, 2, 7, 5, 4, 7, 1, 3, 6};
        selectionSort(testcase1);
        Basic.printArray(testcase1,testcase1.length);
    }
}

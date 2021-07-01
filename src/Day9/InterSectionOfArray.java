package Day9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InterSectionOfArray {
    public static void usingSorted(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0,j =0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+"\t");
                i++ ;
                j++;
            }
            else if(arr1[i]>arr2[j])
                j++;
            else
                i++;
        }
    }
    public static void usingHash(int arr[]){

    }

    public static void main(String[] args) {
        int[] testcase1a = new int[]{2, 6, 1, 2};
        int[] testcase1b = new int[]{1, 2 ,3, 4, 2};
        int[] testcase2a = new int[]{10,10};
        int[] testcase2b = new int[]{10};
        usingSorted(testcase1a,testcase1b);
        System.out.println();
        usingSorted(testcase2a,testcase2b);


    }
}

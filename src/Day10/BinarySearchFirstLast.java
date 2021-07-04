package Day10;

import java.nio.charset.IllegalCharsetNameException;

public class BinarySearchFirstLast {
    public static void firstlast(int[]arr,int key){
        int high = arr.length-1;
        int low = 0;
        int first = Integer.MAX_VALUE;
        int last = Integer.MAX_VALUE;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>key){
                high = mid-1;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                last = mid;
                low = mid+1;
            }
        }
        low = 0;
        high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>key){
                high = mid-1;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                first = mid;
                high = mid-1;
            }
        }
        System.out.println(first+"\t"+last);
    }
    public static void main(String[] args) {
        int[] testcase = new int[]{10, 20, 20, 40, 50, 60};
        firstlast(testcase, 20);
    }
}

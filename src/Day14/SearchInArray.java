package Day14;

import utilities.Basic;

public class SearchInArray {
    public static int linearSearch(int[]A,int key,int n){
        if(n<=0){
            if(A[0] == key)
                return 0;
            else
                return -1;
        }
        else{
            if(A[n] == key)
                return n;
            else
                return linearSearch(A,key,n-1);
        }
    }
    public static int binarySearch(int []A,int key,int low,int high) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        if (A[mid] == key)
            return mid;
        else if (A[mid] > key)
            return binarySearch(A, key, low, mid - 1);
        else
            return binarySearch(A, key, mid + 1, high);
    }
    public static int lastindex(int []A,int key,int start){
        if(start>=A.length)
            return -1;
        int index = lastindex(A,key,start+1);
//        if(index==-1) {
//            if (A[start] == key)
//                return start;
//        }
//        return index;
        if(index != -1)
            return index;
        if (A[start] == key)
                return start;
        return index;
    }
    public static int [] allIndex(int []A,int key,int start){
        if(start>=A.length) {
            int[] indexes = new int[0];
            return indexes;
        }
        int [] smallindexes = allIndex(A,key,start+1);
        if(A[start] == key){
            int [] indexes = new int[smallindexes.length+1];
            indexes[0] = start;
            for (int i =0; i<smallindexes.length;i++){
                indexes[i+1] = smallindexes[i];
            }
            return indexes;
        }
        return smallindexes;
    }
    public static void main(String[] args) {
        int[] testcase = new int[]{1, 2, 3, 4, 6};
        System.out.println(linearSearch(testcase, 6, testcase.length - 1));
        System.out.println(binarySearch(testcase,3,0, testcase.length-1));
        int[] testcase2 = new int[]{1, 2, 3, 3};
        System.out.println(lastindex(testcase2,2,0));
       int [] x =  allIndex(testcase2,3,0);
        Basic.printArray(x,x.length);
    }
}

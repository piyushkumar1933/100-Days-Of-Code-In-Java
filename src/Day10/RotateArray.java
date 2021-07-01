package Day10;

import utilities.Basic;

public class RotateArray {
    public static void rotateArray(int [] arr,int num){
        int n = arr.length;
        num = num%n;
        if(num<0)
            num+=n;
        for(int i = 1; i<=num;i++) {
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                if (j == 0)
                    a[j] = arr[n - 1];
                else
                    a[j] = arr[j - 1];
                //System.out.println(arr[j]);
            }
            arr = a;

            Basic.printArray(arr, n);
            System.out.println();
        }
    }
    public static void rotate1(int arr[],int num){
        int n = arr.length;
        num = num%n;
        if(num<0)
            num+=n;
        int index = (n-num)%n;
        int[] a = new int[n];
        for(int i =0; i<n;i++){
            a[i] = arr[index++];
            index = index%n;
        }
        Basic.printArray(a,n);
    }

    public static void main(String[] args) {
        int [] testcase1 = new int[]{3,2,0,7,4};
        rotateArray(testcase1,4);
        rotate1(testcase1,5);
    }
}

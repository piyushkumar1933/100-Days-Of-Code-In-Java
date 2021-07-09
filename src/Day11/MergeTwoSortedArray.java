package Day11;

import utilities.Basic;

public class MergeTwoSortedArray {
    public static void mergeArr(int a[],int b[]){
        int index=0,index1=0,index2 = 0;
        int n1 = a.length;
        int n2 = b.length;
        int c[] = new int[n1+n2];
        while (index1<n1 && index2<n2){
            if(a[index1]>b[index2]){
                c[index] = b[index2];
                index++;
                index2++;
            }
            else{
                c[index] = a[index1];
                index++;
                index1++;
            }
        }
        //Need not to write if and else
        //if(index1<n1){
            for (int i = index1; i<n1;i++){
                c[index++] = a[i];
            }
        //}
        //else {
            for (int i = index2; i<n2;i++){
                c[index++] = b[i];
            }
        //}
        Basic.printArray(c,c.length);
    }
    public static void main(String[] args) {
        int testcase1[] = new int[]{9, 20, 77};
        int testcase2[] = new int[]{1,4,7, 4, 47};
        mergeArr(testcase1,testcase2);
    }
}

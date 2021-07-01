/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once.
that is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice.
 You need to find and return that duplicate number present in the array.
 */

package Day9;

import utilities.Basic;

import java.util.Arrays;

public class FindDuplicateElement {
    public static int finddup1(int A[]){
        Arrays.sort(A);
        for (int i = 0; i< A.length-1; i++){
            if(A[i]==A[i+1]){
                return A[i];
            }
        }
        if(A[A.length-1]!=A.length-2){
            return Integer.MIN_VALUE;
        }
        else
            return A[A.length-1];
    }
    public static int findxordup(int A[]){
        int res = 0;
        for(int i = 0; i<=A.length-2;i++){
            res ^=i^A[i];
        }
        return res^A[A.length-1];
    }
    public static int findFormuladup(int A[]){
        int sum = 0;
        int n = A.length;
        int partialsum = (n-1)*(n-2)/2;
        for (int i = 0; i<n;i++){
            sum+=A[i];
        }
        return sum-partialsum;
    }

    public static void main(String[] args) {
        int testcase1[] = new int[]{0, 2, 7, 5, 4, 7, 1, 3, 6};
        int testcase2[] = new int[]{0, 5, 2, 5, 4, 7, 1, 3, 6};
        System.out.println(finddup1(testcase1));
        System.out.println(findxordup(testcase1));
        System.out.println(findFormuladup(testcase1));
        System.out.println(finddup1(testcase2));
        System.out.println(findxordup(testcase2));
        System.out.println(findFormuladup(testcase2));
    }
}

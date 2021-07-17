package Day14;

public class CheckSorted {
    public static boolean issorted(int[]input){
        if(input.length<=1)
            return true;
        int[] samllinput = new int[input.length-1];
        for (int i = 1;i<input.length;i++)
            samllinput[i-1] = input[i];
        if(!issorted(samllinput))
            return false;
        if(input[0]<=input[1])
            return true;
        else
            return false;
    }
    public static boolean isSorted(int []A,int n){
        if(n<=0)
            return true;
        if(A[n-1]>A[n])
            return false;
        return isSorted(A,n-1);
    }
    public static void main(String[] args) {
        int[]testcase = new int[]{1,2,3,4,6};
        System.out.println(issorted(testcase));
        System.out.println(isSorted(testcase, testcase.length-1));

    }
}

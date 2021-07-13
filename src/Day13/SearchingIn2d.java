package Day13;

public class SearchingIn2d {
    public static void findElement(int A[][],int x) {
        int lowc = 0, highc = A[0].length - 1;
        int lowr = 0, highr = A.length;
        for (int i = 0; i < A.length; i++) {
            lowc = 0;
            highc = A[i].length-1;
            //int midr = (lowr+highr)/2;
            //int val = A[midc][midr];
            while (lowc <= highc) {
                int midc = (lowc + highc) / 2;
                if (A[i][midc] > x) {
                    highc = midc - 1;
                } else if (A[i][midc] < x) {
                    lowc = midc + 1;
                } else {
                    System.out.println(i+"\t"+midc);
                    return;
                }
               // System.out.println(i+" "+midc);
            }
        }
        System.out.println("Not Present");
    }
    public static void findElement2(int [][]A,int x){
        int col = A[0].length-1;
        int row = 0;
        while(col>=0 && row<A.length ){
            if(A[row][col]>x){
                col--;
            }
            else if(A[row][col]<x)
                row++;
            else {
                System.out.println(row+"\t"+col);
                return;
            }

        }
        System.out.println("Not Present");
    }
    public static void main(String[] args) {
        int [][]A  = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            findElement(A,3);
            findElement2(A,3);
    }
}

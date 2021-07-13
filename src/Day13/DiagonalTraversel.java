package Day13;

public class DiagonalTraversel {
    public static void printDiagonalwise(int [][]A){
        int c = 0;
        while (c<A[0].length){
            for (int i = 0, j = c; j<A.length;i++,j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
            c+=1;
        }
    }

    public static void main(String[] args) {
        int [][]A  = new int[][]{{1,2,3,4,17,21},{5,6,7,8,18,22},{9,10,11,12,19,23},{13,14,15,16,20,24}};
        printDiagonalwise(A);

    }

}

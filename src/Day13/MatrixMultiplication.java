package Day13;

public class MatrixMultiplication {
    public static void matrixMultiply(int[][]A,int[][]B){
        int n1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;
        int n2 = B.length;
        if(c1 != n2) {
            System.out.println("Invalid Input");
            return;
        }
        int[][] c = new int[n1][c2];
        for (int i = 0; i<n1;i++){
            for (int j = 0; j<c2;j++){
                int sum = 0;
                for(int k = 0; k<n2;k++){
                    sum+=A[i][k]*B[k][j];
                }
                c[i][j] = sum;
            }
        }
        for (int i = 0; i<c.length;i++){
            for (int j = 0; j<c[0].length;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][]A = Array2D.input2d();
        int [][]B = Array2D.input2d();
        matrixMultiply(A,B);
    }
}

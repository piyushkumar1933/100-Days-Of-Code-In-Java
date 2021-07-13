package Day13;

import java.util.Scanner;

public class Array2D {
    public static int[][] input2d(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The No Of ROW");
        int row = sc.nextInt();
        System.out.println("Enter No of COLUMNS");
        int col = sc.nextInt();

        int [][] matrix = new int[row][col];
        for(int i = 0;i<row;i++) {
            for (int j = 0; j <col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
   public static void printwave(int[][]matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i<col;i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    System.out.print(matrix[j][i]+"\t");
                }
            }
            else
                for (int j =row-1; j >=0 ; j--) {
                    System.out.print(matrix[j][i]+"\t");
                }
        }
    }
    public static void print2d(int[][]A){
        for (int i = 0; i<A.length;i++){
            for (int j = 0; j<A[0].length;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //Spiral Print
    public static void spiralPrint(int [][] matrix) {
        int rs = 0, re = matrix.length - 1;
        int cs = 0, ce = matrix[0].length - 1;
        int ele = (re+1)*(ce+1);
        int count = 0;
        while (count<ele) {
            for (int i = cs; i <= ce&&count<ele; i++) {
                System.out.print(matrix[rs][i]+"\t");
                count++;
            }
            rs = rs + 1;
            for (int i = rs;i<=re&&count<ele;i++ ){
                System.out.print(matrix[i][ce]+"\t");
                count++;
            }
            ce-=1;
            for(int i = ce;i>=cs&&count<ele;i-- ){
                System.out.print(matrix[re][i]+"\t");
                count++;
            }
            re-=1;
            for(int i = re;i>=rs&&count<ele;i--){
                System.out.print(matrix[i][cs]+"\t");
                count++;
            }
            cs+=1;
        }
    }
    public static void main(String[] args) {
        int [][] input = input2d();
        printwave(input);
        System.out.println();
        spiralPrint(input);
    }
}

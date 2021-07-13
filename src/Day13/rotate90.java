package Day13;

public class rotate90 {
    public static void rotate(int[][]A){
        // Transpose
            for (int i = 0; i<A.length/2+1;i++){
                for (int j = i; j<A[0].length;j++){
                    swap(A,i,j);
                }
            }
            //Using Swapping
//            for(int j = 0; j<A[0].length/2;j++){
//                for (int i = 0; i<A.length;i++){
//                    int temp = A[i][j];
//                    A[i][j] = A[i][A[0].length-1-j];
//                    A[i][A[0].length-j-1] = temp;
//                }
//            }
            //Using Reverse column
        for (int i = 0; i<A.length;i++){
            int start = 0;
            int end  = A[i].length-1;
            while (start<end){
                int temp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = temp;
                start++;
                end--;
            }
        }

    }

    public static void swap(int[][]A,int i,int j){
        int temp;
        temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;

    }

    public static void main(String[] args) {
        int [][]A  = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(A);
        Array2D.print2d(A);

    }
}

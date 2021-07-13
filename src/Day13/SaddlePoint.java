package Day13;

public class SaddlePoint {
    public static void findSaddlePoint(int A[][]){
        for (int i = 0; i<A.length;i++){
            boolean flag = true;
            int minc = 0;
            for (int j = 1; j<A[0].length;j++){
                if(A[i][j]<A[i][minc])
                    minc = j;
            }
            for(int k = 0; k<A.length;k++){
                if(A[k][minc]>A[i][minc]){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(A[i][minc]);
                return;
            }
        }
        System.out.println("Invalid Input");
    }

    public static void main(String[] args) {
        int [][]A  = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{3,14,15,16}};
        findSaddlePoint(A);

    }

}

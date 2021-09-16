package BackTracking;

public class NQueen {
    public  static  boolean isPlaced(int [][] board,int i, int j){
        for(int k =0;k<=i;k++){
            if(board[k][j] == 1)
                return false;
            for(int l =0;l< board.length;l++){
                if(i+j == k+l || i-j == k-l){
                    if(board[k][l] == 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public  static void printPlacedQ(int[][] board,int row, int n){
        if(row == n){
            for(int[] x: board){
                for (int temp:x){
                    System.out.print(temp+"\t");
                }
            }
            System.out.println();
            return;
        }
        for(int i =0;i<n;i++){
            if(isPlaced(board,row,i)){
                //System.out.println(row+" "+i);
                board[row][i] =1;
                printPlacedQ(board,row+1,n);
                board[row][i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int [][] board = new int[4][4];
        printPlacedQ(board,0,4);

    }
}

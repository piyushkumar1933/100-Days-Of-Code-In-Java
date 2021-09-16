package BackTracking;

public class PrintAllPathRatMaze {
    public static void printall(int[][] maze,int [][]path,int i, int j){
        int n = maze.length;
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1){
            return ;
        }
        path[i][j] = 1;
        if(i == n-1 && j == n-1) {
            for (int k = 0; k < path.length; k++) {
                for (int l = 0; l < path[k].length; l++) {
                    System.out.print(path[k][l]+"\t");
                }
            }
            System.out.println();
            path[i][j] =0;
            return;
        }
        printall(maze,path,i-1,j);
        printall(maze,path,i+1,j);
        printall(maze,path,i,j-1);
        printall(maze,path,i,j+1);
        path[i][j] = 0;
    }
    public static void main(String[] args) {
        int [][] maze = new int[][]{{1,0,1},{1,1,1},{1,1,1}};
        printall(maze,new int[3][3],0,0);
    }
}

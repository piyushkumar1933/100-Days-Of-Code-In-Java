package BackTracking;

public class RatInMaze {
    public static boolean isPathPossible(int[][] maze){
        int n = maze.length;
        int [][] path = new int[n][n];
        return findpath(maze,0,0,path);
    }
    public static boolean findpath(int [][] maze,int i,int j,int[][]path){
        //Check gor valid i,j or not
        int n = maze.length;
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        path[i][j] = 1;
        if(i == n-1 && j == n-1){
            for(int k = 0; k<path.length;k++){
                for(int l = 0; l<path[k].length;l++){
                    if(path[k][l] == 1){
                        System.out.println(k+ " "+l);
                    }
                }
            }
            return true;
        }
        if(findpath(maze,i-1,j,path)){
            return true;
        }
        if(findpath(maze,i+1,j,path)){
            return true;
        }
        if(findpath(maze,i,j-1,path)){
            return true;
        }
        if(findpath(maze,i,j+1,path)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] maze = new int[][]{{1,0,1},{1,0,1},{1,1,1}};
        System.out.println(isPathPossible(maze));
    }
}

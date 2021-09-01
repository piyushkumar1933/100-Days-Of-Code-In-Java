package Recursion;

public class ReturnSubsetOFAnArray {
    public static int[][] returnSub(int[] arr,int start){
        if(start== arr.length){
            return new int [1][0];
        }
        int [][]small = returnSub(arr,start+1);
        int [][] output = new int[2*small.length][];
        int k = 0;
        for(int i = 0; i<small.length;i++){
            int [] temp = new int[small[i].length];
            for(int j = 0; j<small[i].length;j++){
                temp[j] = small[i][j];
            }
            output[k++] = temp;
        }
        for(int i = 0; i<small.length;i++){
            int [] temp = new int[small[i].length+1];
            temp[0] = arr[start];
            for(int j = 1; j<=small[i].length;j++){
                temp[j] = small[i][j-1];
            }
            output[k++] = temp;
        }
        return output;
    }
    public static void main(String[] args) {
        int [] ar = new int []{1,2,3,4};
        int [][] arr = returnSub(ar,0);
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

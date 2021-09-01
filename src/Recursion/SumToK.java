package Recursion;
import java.util.Scanner;
public class SumToK {
    public static int[][] sumk(int []arr,int k,int start){
        if(arr.length == start){
            if(k == 0)
                return new int [1][0];
            return new int[0][0];
        }
        int [][]temp1 = sumk(arr,k-arr[start],start+1);
        int [][] temp2 = sumk(arr,k,start+1);
        int [][] ans = new int[temp1.length+temp2.length][];
        int index = 0;
        for(int i = 0; i<temp2.length;i++){
            ans[index++] = temp2[i];
        }
        for(int i = 0; i<temp1.length;i++){
            ans[index] = new int[temp1[i].length+1];
            ans[index][0] = arr[start];
            for(int j = 0; j<temp1[0].length;j++){
                ans[index][j+1] = temp1[i][j];
            }
            index++;
        }
    return ans;
    }
    public static void main(String[] args) {
        int test1[] = {5, 12, 3, 17, 1, 18, 15, 3, 17 };
        int testOut[][] = sumk(test1,6,0);
    for(int [] x:testOut){
        for(int t:x){
            System.out.print(t);
        }
        System.out.println();
    }
    }
}

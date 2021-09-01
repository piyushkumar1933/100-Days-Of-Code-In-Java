package Recursion;

import java.util.ArrayList;

public class PermutationRecursion {
    private static ArrayList<String>ans = new ArrayList<>();
    public static ArrayList<String> findPermutations(String str){
        //Convert String Array to character Array
        char[] arr = str.toCharArray();
        permutation(arr,0,arr.length-1);
        return ans;
    }
    public static void permutation(char[]arr,int start,int end){
        if(start>=end){
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            ans.add(new String(arr));
            return;
        }
        for (int i = start;i<=end;i++){
            swap(arr,start,i);
            permutation(arr,start+1,end);
            swap(arr,start,i);
        }
    }
    private static void swap(char[]arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        findPermutations("abc");
    }
}

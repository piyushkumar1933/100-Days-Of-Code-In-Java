package Recursion;

import java.util.Arrays;

public class SubSequanceRecursion {
    public static String [] subSequance(String str){
        if(str.length() == 0){
            return new String[]{""};
        }
        String[] small = subSequance(str.substring(1));
        String [] ans = new String[2* small.length];
        for(int i = 0; i< small.length;i++){
            ans[i] = small[i];
        }
        for(int i = 0; i<small.length;i++){
            ans[i+ small.length] = str.charAt(0)+small[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] ans = subSequance("Helxo");
        Arrays.sort(ans);
        for (String x : ans) {
            System.out.println(x);
        }

    }
}

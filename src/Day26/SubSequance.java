package Day26;

import java.util.Arrays;

public class SubSequance {
    public static String [] ssub(String s){
        String [] substring = new String[(int)Math.pow(2,s.length())];
        int k = 0;
        for(int i = 0; i<s.length();i++){
            for(int j = i;j<=s.length();j++){
                substring[k++] = s.substring(i,j);
            }
        }
        return substring;
    }
    public static void main(String[] args) {
    String [] x = ssub("eren");
    String [] y = new String[x.length-1];
    int k = 0;
    for(int i = 0; i<x.length;i++) {
        System.out.println(x[i]);
        if (x[i] != "" && x[i] != null) {
            y[k++] = x[i];
        }
    }
        Arrays.sort(y);
        for (String x11:
             y) {
            System.out.print(x11);
        }
    }

}

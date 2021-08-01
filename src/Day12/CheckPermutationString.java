package Day12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckPermutationString {
    //i ist index
    // l lat index
    public static String swap(String s, int i,int j){
        char temp;
        char [] ch = s.toCharArray();
        temp = ch[j];
        ch[j] = ch[i];
        ch[i] = temp;
        return String.valueOf(ch);

    }
    public static void permutation(String s,int i ,int l){
        if(i == l)
            System.out.println(s);
        else {
            for (int k = i; k<=l;k++){
                s = swap(s,i,k);
                permutation(s,i+1,l);
               s =  swap(s,i,k);
            }
        }
    }
    public static void checkpermute1(String s,String s1){
        if(s.length()!=s1.length()){
            System.out.println("False");
            return;
        }
        char [] temp = s.toCharArray();
        Arrays.sort(temp);
        s = String.valueOf(temp);
         temp = s1.toCharArray();
        Arrays.sort(temp);
        s1 = String.valueOf(temp);
        if(s1.equals(s))
            System.out.println("True");

    }
    public static void checkpermute2(String s,String s1){
        if(s.length()!=s1.length()){
            System.out.println("False");
            return;
        }
        int [] buffer = new int[256];
        for (int i = 0; i<s.length();i++){
            buffer[(int)s.charAt(i)] += 1;
        }
        for (int i = 0; i<s1.length();i++){
            buffer[(int)s1.charAt(i)] -=1;
        }
        for (int x:buffer){
            if(x!=0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");

    }
    public static void main(String[] args) {
        //permutation("ABC",0,2);
        //checkpermute1("ABCD","DBCA");
       // checkpermute2("ABCD","ABCD");
        checkpermute2("build","dubli");
    }
}

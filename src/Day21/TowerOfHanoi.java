package Day21;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOH(int n, char A,char B, char C){
        if(n == 1){
            System.out.println(A+ "->"+C);
        }
        else {
            TOH(n - 1, A, C, B);
            System.out.println(A + "->" + C);
            TOH(n - 1, B, A, C);
        }

    }
    public static void convertDate(String s){


    }
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int x = Integer.parseInt(s);
        TOH(x,'A','B','C');
    }
}

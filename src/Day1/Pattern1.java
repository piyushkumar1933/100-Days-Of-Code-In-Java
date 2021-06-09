/**
 * Print the following pattern
 * N = 3
 *    1
 *   2 3
 *  3 4 5
 *
 */


package Day1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ROWS");
        int n = sc.nextInt();
        int space,val =1;
        for(int i = 0; i<n;i++){
            space = 1;
            while(space<n-i){
                System.out.print(" ");
                space++;
            }
            for (int j = 0; j<=i;j++){
                System.out.print(val++ + " ");
            }
            System.out.println();
        }
    }
}

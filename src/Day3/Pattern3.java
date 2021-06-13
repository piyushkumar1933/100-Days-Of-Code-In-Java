/*
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
 */


package Day3;

import utilities.Basic;
public class Pattern3 {
    public  static void printpattern(int n){
        int i =0;
        for(;i<=n;i++){
            System.out.print("*");
            int j;
            for(j = 1; j<=i;j++){
                System.out.print(j);
            }
            for(j = i;j>1;j--){
                System.out.print(j-1);
            }
            if(i!=0) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = i-2;i>=0;i--){
            System.out.print("*");
            int j;
            for(j = 1; j<=i;j++){
                System.out.print(j);
            }
            for(j = i;j>1;j--){
                System.out.print(j-1);
            }
            if(i!=0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

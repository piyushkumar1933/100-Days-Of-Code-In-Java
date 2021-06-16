/*
11
*	*	*	*	*	*					*
					*					*
					*					*
					*					*
					*					*
*	*	*	*	*	*	*	*	*	*	*
*					*
*					*
*					*
*					*
*					*	*	*	*	*	*

 */

package Day5;

import utilities.Basic;

public class Swastik {
    public static void printPattern(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n;j++){
                if((i == n/2+1)||(j==n/2+1)||(i==1 && j<=n/2)||(i==n && j>n/2)||(i<=n/2 && j == n)
                ||(i>n/2 && j==1)){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(Basic.oneIntInput());
    }
}

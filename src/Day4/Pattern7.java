/*
Sample Input
5
Sample Output
*				*
	*		*
		*
	*		*
*				*

 */
package Day4;
import utilities.Basic;
public class Pattern7 {
    public static void printpattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i == j || i+j == n+1){
                    System.out.print("\t*");
                }
                else {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

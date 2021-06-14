/*
Sample Input
5
Sample Output
*	*	*		*	*	*
*	*				*	*
*						*
*	*				*	*
*	*	*		*	*	*
 */
package Day4;
import utilities.Basic;
public class Pattern6 {
    public static void printpattern(int n){
        int star =(n+1)/2;
        int space = 1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=star;j++){
                System.out.print("\t*");
            }
            for (int j = 1; j<=space;j++){
                System.out.print("\t ");
            }
            for(int j =1; j<=star;j++){
                System.out.print("\t*");
            }
            if(i<(n+1)/2){
                star--;
                space+=2;
            }
            else {
                star++;
                space-=2;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

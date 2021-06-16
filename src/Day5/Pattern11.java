/*
Sample Input
7
Sample Output
*	*	*	*	*	*	*
	*				*
		*		*
			*
		*	*	*
	*	*	*	*	*
*	*	*	*	*	*	*
 */
package Day5;

import utilities.Basic;

public class Pattern11 {
    public static void printPattern(int n){
        int space = 0;
        int star = n;
        int space2 = 0;
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j = 1; j<=star;j++){
                if(space2 == 1 || (j == 1 || j == star ) || i == 1){
                System.out.print("*\t");
            }
            else
                System.out.print("\t");
            }
            if(i<=n/2){
                star-=2;
                space++;

            }
            else {
                star+=2;
                space--;
                space2 =1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(Basic.oneIntInput());
    }
}

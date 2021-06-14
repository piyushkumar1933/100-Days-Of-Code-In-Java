/*Sample Input
        5
       Sample Output
		*
	*		*
*				*
	*		*
		*
 */
package Day4;

import utilities.Basic;

public class Patten8 {
    public static void printpattern(int n){
        int space = (n+1)/2;
        int space2 =-1;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=space;j++){
                System.out.print("\t ");
            }
            System.out.print("*\t");
            if(i!=1 && i!=n){
                for(int j = 1; j<=space2;j++){
                    System.out.print("\t ");
                }
                System.out.print("*");
            }
            if(i>n/2){
                space++;
                space2-=2;
            }
            else {
                space--;
                space2+=2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

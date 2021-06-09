/**
 * Sample Output 1 :
 *    *
 *   ***
 *  *****
 * Sample Input 2 :
 * 4
 * Sample Output 2 :
 *     *
 *    ***
 *   *****
 *  *******
 */
package Day1;

import utilities.Basic;
public class StarPattern1 {
    public static void main(String[] args) {
        int n = Basic.oneIntInput("Enter the value of n");
        int space;
        for(int i = 0; i<n;i++){
            space = i;
            while (space<n-1){
                System.out.print(" ");
                space++;
            }
           for(int j = 0;j<2*i+1; j++){
               System.out.print('*');
           }
            System.out.println();
        }

    }
}

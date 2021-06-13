/*
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
 */
package Day3;

import utilities.Basic;

public class Pattern5 {
    public static void printpattern(int n){
        int i = 1;
        while (i <=n){
            int value = 2*i-1;
            int j = 1;
            while (j <= n) {
                System.out.print(value);
                value += 2;
                if (value > 2*n-1) {
                    value = 1;
                }
                j++;
            }
            System.out.println();
            i++;

        }
    }
    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

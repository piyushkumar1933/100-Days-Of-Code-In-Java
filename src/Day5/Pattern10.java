
/*
    5
		*
		*	*
*	*	*	*	*
		*	*
		*

 */
package Day5;

import utilities.Basic;

public class Pattern10 {
    public  static  void printPattern(int n) {
        int star = 0;
        for (int i = 1; i <= n; i++) {
            int space = n / 2;
            if (i == (n + 1)/2) {
                space = 0;
                for (int j = 1; j <= n / 2; j++) {
                    System.out.print("*\t");
                }
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                star++;
            } else
                star--;
            System.out.println();
        }
    }
        public static void main(String[] args) {
            printPattern(Basic.oneIntInput());
        }

    }


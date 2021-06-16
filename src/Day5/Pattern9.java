/*
5
	 	 	1
	 	2	3	2
	3	4	5	4	3
	 	2	3	2
	 	 	1

 */
package Day5;

import utilities.Basic;

public class Pattern9 {
    public static void printpattern(int num) {
        int space = num / 2;
        int value = 1;
        int noofvalue = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t ");
            }
            int x = value;
            for (int j = 1; j <= noofvalue; j++) {
                System.out.print("\t" + x);
                if (j > noofvalue / 2) {
                    x--;
                } else {
                    x++;
                }
            }
            if (i <= num / 2) {
                value++;
                noofvalue += 2;
                space--;
            } else {
                value--;
                noofvalue -= 2;
                space++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

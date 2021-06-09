/*
if a character is uppercase - 1
lowercase =0
no alphabet = -1
 */
package Day1;

import java.util.Scanner;

public class CharcterIsAlpha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch < 'Z') {
            System.out.println(1);
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }

}

/*
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 */
package Day3;
import utilities.Basic;
public class Pattern4 {
    public static void printpattern(int n){
        for(int i = 1; i<=n;i++){
            int sum = 0;
            for(int j = 1; j<=i;j++){
                System.out.print(j);
                if (j!=i)
                    System.out.print("+");
                sum+=j;
            }
            System.out.println("="+sum);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        printpattern(Basic.oneIntInput());
    }
}

/*
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
 */
package Day14;

public class GPAdd {
    public static double add(int n){
        if(n ==0)
            return 1;
        else {
            return 1/Math.pow(2,n)+add(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(add(3));
        System.out.println(add(4));
    }
}

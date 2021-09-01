package Recursion;

public class StairCase {
    public static int noOfWays(int n){
        if(n<0){
            return 0;
        }
        if(n ==0){
            return 1;
        }
        return noOfWays(n-1)+noOfWays(n-2)+noOfWays(n-3);
    }
    public static void main(String[] args) {
        System.out.println(noOfWays(4));
        System.out.println(noOfWays(5));
    }
}

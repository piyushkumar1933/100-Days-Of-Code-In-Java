package Day8;

public class TrailingFactorialZero {
    public static int trailingzerofact(int n){ // Number of 5 and 2 pair will result 1 zero
                                                // No of zeros = [n/5]+[n/25]+[n/125]+---
        int count =0;
        for(int i = 5; i<=n;i*=5){
            count+=n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingzerofact(5));
        System.out.println(trailingzerofact(100));

    }
}

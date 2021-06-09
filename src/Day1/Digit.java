package Day1;

public class Digit {
    public static int countDigit(int dig){
        int count = 0;
//        if(dig == 0){
//            return 1;
//        }
        while (dig !=0){
            dig = dig/10;
            count++;
        }
        return count;
    }
    public static void printDigit(int dig){
        int ndigit = countDigit(dig);
        int div = (int)Math.pow(10,ndigit-1);
        for(;div!=0;){
            int res = dig/div;
            System.out.println(res);

            dig = dig % div;
            div = div/10;

        }

    }
    public static void reverseDigit(int dig){
        int ndigit = countDigit(dig);
        int rev =0;
        for(int i =1; i<=ndigit;i++){
            System.out.println(dig%10);
            rev = rev*10+dig%10;
            dig = dig/10;

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        int testcase1 = 10909880;
        int testcase2 = 0;
        int testcase3 = 999999999;
        System.out.println(countDigit(testcase1));
        System.out.println(countDigit(testcase2));
        System.out.println(countDigit(testcase3));
        System.out.println();
        printDigit(testcase1);
        printDigit(testcase2);
        printDigit(testcase3);
        System.out.println();
        reverseDigit(testcase1);
        reverseDigit(testcase2);
        reverseDigit(testcase3);
    }
}

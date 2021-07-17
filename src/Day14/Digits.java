package Day14;

public class Digits {
    public static int noOFDigit(int num){
        if(num<=0)
            return 0;
        else
            return noOFDigit(num/10)+1;
    }
    public static int sumOFDigit(int num){
        if(num<=0)
            return 0;
        else
            return sumOFDigit(num/10)+num%10;
    }
    public static void main(String[] args) {
        System.out.println(noOFDigit(7));
        System.out.println(noOFDigit(156));
        System.out.println(noOFDigit(70000));
        System.out.println(noOFDigit(7000011));
        System.out.println(sumOFDigit(12345));
        System.out.println(sumOFDigit(123450));
        System.out.println(sumOFDigit(9));


    }
}

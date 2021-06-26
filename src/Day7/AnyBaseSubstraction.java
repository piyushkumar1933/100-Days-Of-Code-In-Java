package Day7;

public class AnyBaseSubstraction {
    public static int substract(int num1,int num2,int base){
        int carry = 0;
        boolean isneg = num1<num2;
        int res = 0;
        int pow = 1;
        while (num1>0){ //num1 should be larger number;
            int dig1 = num1%10;
            int dig2 = num2%10;
            int dig = dig1-dig2-carry;
            if(dig<0){
                carry = 1;
                dig = dig+base;
                //System.out.println(dig);

            }
            else
                carry = 0;
            res+=dig*pow;
            pow*=10;
            num1/=10;
            num2/=10;
        }
        if(isneg)
            return -1*res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(substract(1212,236,8));
        System.out.println(substract(212,236,8));
    }
}

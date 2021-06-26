package Day7;

public class AnyBaseAddition {
    int carry = 0;
    public static int addbase(int num1,int num2,int base){
        int carry = 0;
        int res = 0;
        int pow = 1;
        int n = num1>num2?num1:num2;
        // Or without using the max no concept or agai addding carry to last
        // we can write loop as
        //while(num1>0||num2>0||carry == 0)
        while (n>0){
            int dig1 = num1%10;
            int dig2 = num2%10;
            int dig = dig1+dig2+carry;
            if(dig>=base){
                carry = dig/base;
                dig = dig%base;
                //carry = dig/base;
            }
            else
                carry = 0;
            res+=dig*pow;
            pow*=10;
            num1/=10;
            num2/=10;
            n/=10;
        }
        return res+carry*pow;
    }

    public static void main(String[] args) {
        System.out.println(addbase(234,343,5));
        System.out.println(addbase(346,777,8));
        System.out.println(addbase(421,767,8));
        System.out.println(addbase(77421,767,8));
        System.out.println(addbase(77421,767,8));
    }
}

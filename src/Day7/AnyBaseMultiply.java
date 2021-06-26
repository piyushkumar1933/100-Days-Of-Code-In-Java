package Day7;

public class AnyBaseMultiply {
    public  static int multiply(int num1,int num2,int base){
        int result = 0;
        int tempnum = num1;
        int pown = 1;
        while (num2>0) {
            int dig2 = num2 % 10;
            num2 /= 10;
            int res = 0;
            int pow = 1;
            int carry = 0;
            num1 = tempnum;
            while (num1 > 0 || carry != 0) {
                int dig1 = num1 % 10;
                int temp = 0;
                num1 /= 10;
                temp = dig2 * dig1 + carry;
                if (temp > base) {
                    carry = temp / base;
                    temp = temp % base;
                    //System.out.println(temp);
                } else
                    carry = 0;
                res += temp * pow;
                pow *= 10;
            }
            result+=AnyBaseAddition.addbase(result*pown,res,base);
            pown*=10;
            //System.out.println(res);
            //System.out.println(result);

        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(multiply(234,6,8));
        //System.out.println(multiply(123,3,4));
        System.out.println(multiply(123,34,4));
    }
}

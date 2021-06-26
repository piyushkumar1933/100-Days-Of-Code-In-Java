package Day7;

public class AnyBaseToDecimal {
    public static int anytoDecimal(int num,int base){
        int decimal = 0;
        int pow = 1;
        while (num>0){
            int dig = num%10;
            decimal+=dig*pow;
            pow*=base;
            num/=10;
        }
        return decimal;
    }
    public static int anytoAny(int num,int base1,int base2){
        int decimal = anytoDecimal(num,base1);
        int result = DecimalToanyBase.demicaltobase(decimal,base2);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(anytoDecimal(1172,8));
        System.out.println(anytoDecimal(11000,2));
        System.out.println(anytoAny(1172,8,10));
        System.out.println(anytoAny(1100,2,10));
        System.out.println(anytoAny(12,10,8));
        System.out.println(anytoAny(1100,2,8));
        System.out.println(anytoAny(172,8,2));
    }
}

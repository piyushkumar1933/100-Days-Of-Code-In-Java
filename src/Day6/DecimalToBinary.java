package Day6;

public class DecimalToBinary {
    public static int decimalToBinary(int num){
        int dec = 0;
        int place = 1;
        while (num!=0){

            int dig = num%2;
            dec = dec+dig*place;
            //System.out.println(dec);
            num = num/2;
            place*=10;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(9));
        System.out.println(decimalToBinary(0));
        System.out.println(decimalToBinary(12));
        System.out.println(decimalToBinary(7));
    }
}

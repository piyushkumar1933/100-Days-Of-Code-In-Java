package Day6;

public class BinaryTodecimal {
    public static int binarytoDecimal(int num){
        int temp = num;
        int count = 0;
        int decimal = 0;
        while(temp!=0){
            int dig = temp%10;
                decimal = decimal + dig*(int)Math.pow(2,count);
                count+=1;
                System.out.println(decimal);
                temp = temp/10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        //System.out.println(binarytoDecimal(1100));
        //System.out.println(binarytoDecimal(1111100));
        System.out.println(binarytoDecimal(1111));
    }

}

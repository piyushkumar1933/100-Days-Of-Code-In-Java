package Day7;

public class DecimalToanyBase {
    public static int demicaltobase(int num,int base){
        int result = 0;
        int placevalue =1;
        while (num!=0){
            int dig = num%base;
            result+=dig*placevalue;
            placevalue*=10;
            num = num/base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(demicaltobase(12,2));
        System.out.println(demicaltobase(57,2));
        System.out.println(demicaltobase(634,8));
    }
}

package Day2;
import utilities.Basic;
public class RotateNumber {
    public  static void rotate(int number,int d){
        int rev = 0;
        int  temp = number;
        int ndig = Basic.countDigit(number);
        d = d%ndig;
        if(d < 0){
            d = ndig+d;
        }
        int right = temp%(int)Math.pow(10,d);
        right = right*(int)Math.pow(10,ndig-d);
        int left = temp/(int)Math.pow(10,d);
        //System.out.println(left);
        rev = left+right;

//        for(int i = 0; i<d;i++){
//            int dig = temp%10;
//            rev = 0;
//            rev = rev + dig*(int)Math.pow(10,ndig-1);
//            temp = temp/10;
//            for(int j = 2; j<=ndig;j++){
//               dig = temp%10;
//               rev += dig*(int)Math.pow(10,j-2);
//               temp = temp/10;
//            }
//            temp = rev;
//        }
        System.out.println(rev);

    }

    public static void main(String[] args) {
        RotateNumber.rotate(562984,2);
        RotateNumber.rotate(562984,-0);
    }
}

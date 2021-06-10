package Day2;

public class GcdLcm {
    public static void gcd(int num1,int num2){
        int gcd = 1;
        int div = num1;
        int divident = num2;
        while (divident%div != 0){
            gcd = div;
            div = divident%div;
            //System.out.println(div);
            divident = gcd;
        }
        // Brute froce approach
//        int i = Math.min(num1,num2);
//        for(gcd = Math.min(num1,num2); gcd >= 1; gcd--){
//            if(num1 % gcd == 0 && num2 % gcd == 0){
//                break;
//            }
//        }
        int lcm = num1*num2/div;  // lcm *gcd = num * num2
        System.out.println(div);
        System.out.println(lcm);
    }
    public static void lcm(int num1,int num2){
        int lcm = Math.max(num1,num2);
        int max=num1*num2;
        while (lcm <= max){
            if(lcm%num1 == 0 && lcm%num2 == 0 ){
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        gcd(8,56);
        lcm(2,4);
    }
}

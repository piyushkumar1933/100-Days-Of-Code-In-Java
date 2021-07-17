package Day14;

public class Multiplication_Recur {
    public static int multiply(int a,int b){
        if(b==0){
            return 0;
        }
        else{
            return a+multiply(a,b-1);
        }
    }
    public static int countZero(int num){
        int count=0;
        if(num<=9){
            if(num == 0)
                return 1;
            return 0;
        }
        else{
            if(num % 10 ==0)
                count++;
            return count+countZero(num/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(multiply(0,29));
        System.out.println(countZero(199));
        System.out.println(countZero(708000));
        System.out.println(countZero(000));
    }
}

package Day8;

public class Fibonaci {
    public static boolean isfibo(int n){
        int temp = n;
        int first = 0,second = 1,third=0;
        while (temp>0){
            if(first == n){
                //System.out.println(second);
                return true;
            }
            //System.out.println(first);
            third = first+second;
            first = second;
            second = third;
            temp--;
        }
        return false;
    }

    public static void main(String[] args) {
        isfibo(15);
    }
}

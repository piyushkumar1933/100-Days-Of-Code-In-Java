package Day8;

public class Power {
    public static int recursivePow(int n, int x){
        if(n== 0){
            return 1;
        }
        if(x ==0)
            return 0;
        int temp =recursivePow(n/2,x);
        temp*=temp;
        if(n%2==0){
            return temp;
        }
        else
            return temp*x;
    }
    public static int iterativePow(int n,int x){
        int res = 1;
        while (n>0){
            if(n%2 != 0){
                res*=x;
            }
            x *=x;
            n/=2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(recursivePow(5,2));
        System.out.println(iterativePow(5,2));
    }
}

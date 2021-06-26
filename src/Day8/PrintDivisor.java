package Day8;

public class PrintDivisor {
    public static void divnotsorted(int n){
        for(int i =1;i*i<=n;i++){ //atleast one pair will be samll than square root
            if(n%i == 0){
                System.out.print(i+"\t");
                if(i!=n/i) // if say number is 25 than pair is 5 ,5 than we just want to print once
                    System.out.print(n/i+"\t");
            }

        }
    }
    public static void divsorted(int n){
        int i;
        for (i = 1; i*i<=n;i++){
            if(n%i == 0){
                System.out.print(i+"\t");
            }
        }
        for(i=i-1;i>=1;i--){
            if(n%i == 0) {
                if (i != n / i) {
                    System.out.print(n / i + "\t");

                }
            }
        }
    }

    public static void main(String[] args) {
        divnotsorted(30);
        System.out.println();
        divsorted(30);
        System.out.println();
        divsorted(25);
        System.out.println();
        divsorted(15);
    }
}

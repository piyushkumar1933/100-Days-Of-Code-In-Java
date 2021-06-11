package Day3;

public class PrimeFactor {
    public static void factor(int num){
        int div = 2;
        for(div =2; div*div <= num; div++){
            while (num%div == 0) {
                num = num / div;
                System.out.print(div + " ");
            }
        }
        if(num !=1){ // after root there is no prime;
            System.out.print(num);
        }
//        while (num != 1){
//            if(num%div == 0){
//                num = num/div;
//                System.out.print(div+" ");
//            }
//            else {
//                div++;
//            }
//        }
    }

    public static void main(String[] args) {
        factor(1440);
    }
}

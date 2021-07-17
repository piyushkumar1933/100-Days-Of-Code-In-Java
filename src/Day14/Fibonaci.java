package Day14;

public class Fibonaci {
    public static int nthfibo(int num){
        if(num<2)
            return num;
        else
            return nthfibo(num-1)+nthfibo(num-2);
    }
    //Not working beacause the value is calculated multiple time for each num so it will print many
//    public static int printfibo(int num){
//        if(num<2){
//            System.out.println(num);
//            return num;
//        }
//        else {
//            int temp = printfibo(num-1)+printfibo(num-2);
//            System.out.println(temp);
//            return temp;
//        }
//    }

    public static void main(String[] args) {
        System.out.println(nthfibo(1));
        System.out.println(nthfibo(3));
        System.out.println(nthfibo(6));
        for(int i = 0;i<10;i++)
            System.out.println(nthfibo(i));
    }
}

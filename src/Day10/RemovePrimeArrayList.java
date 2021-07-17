package Day10;

import java.util.ArrayList;

public class RemovePrimeArrayList {
    public static ArrayList<Integer> removePrime(ArrayList<Integer> A){
        int start = 0;
        int end = A.size()-1;
        for(;start<=end;){
            int temp = A.get(start);
            if(isPrime(temp)){
                A.remove(start);
                end--;
            }
            else
                start++;

        }
        return A;
    }
    public static boolean isPrime(int x){
        boolean isp = true;
        for(int i = 2;i*i<=x;i++){
            if(x%i==0){
                isp = false;
                break;
            }
        }
        return isp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> testcase = new ArrayList<>();
        for (int i =1;i<20;i++)
            testcase.add(i);
        for(Integer x:removePrime(testcase)){
            System.out.println(x);
        }

    }
}

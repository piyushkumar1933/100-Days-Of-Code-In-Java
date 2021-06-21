package Day6;

public class SquareRoot {
    public static int squareRoot(int n){
        int i = 1;
        int x=1;
            while(i*i<=n){
                x = i++;
            }
            return x;
    }
    public static boolean issequance(int [] arr){
        int first = arr[0];
        boolean isdecr = true;
        for (int i =1; i<arr.length;i++){
            if (first==arr[i]){
                return false;
            }
            else if(first<arr[i]){
                    isdecr = false;
            }
            else if(first>arr[i]){
                if(!isdecr){
                    return false;
                }
            }
            first= arr[i];

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(10));
        System.out.println(squareRoot(16));
        System.out.println(squareRoot(4));
        int[] testcase1 = new int[]{2,4,5,6,7};
        int[] testcase2 = new int[]{2,4,5,6,7,8,1,2};
        System.out.println(issequance(testcase1));
        System.out.println(issequance(testcase2));
    }
}

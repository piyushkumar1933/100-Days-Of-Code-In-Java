package Day10;

public class Subset {
    public static int binary(int n){
        int res = 0;
        int pow = 1;
        while (n>0){
            int d = n%2;
            res = res+ d*pow;
            pow*=10;
            n/=2;
        }
        return res;
    }
    public static void subsets(int arr[]){
        int n = arr.length;
        for(int i = 0; i<(int)Math.pow(2,n);i++){
            int b = binary(i);
            String set = "";
            for (int j = n-1; j>=0;j--){
                int d = b%10;
                b = b/10;
                if(d == 1)
                    set = arr[j]+"\t"+set;
                else
                    set = "-\t"+set;
            }
            System.out.println(set);
        }
    }

    public static void main(String[] args) {
        int[] testcase = new int[]{10,20,30};
        subsets(testcase);
    }
}

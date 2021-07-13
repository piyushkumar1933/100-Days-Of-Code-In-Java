package Day13;

public class EqulibriumIndex {
    public static void method1(int[] arr){
        int lsum =arr[0];
        for (int i = 1; i< arr.length;i++){
            int rsum = 0;
            for(int j = i+1; j< arr.length;j++){
                rsum+=arr[j];
            }
            //System.out.println(rsum);
            if(rsum == lsum){
                System.out.println(i);
                return;
            }
            lsum+=arr[i];
        }
        System.out.println(-1);
        return;
    }
    public static void  method2(int arr[]){
        int rsum = 0;
        int lsum = 0;
        int tsum = 0;
        for(int j = 0; j< arr.length;j++){
            tsum+=arr[j];
        }
        lsum = arr[0];
        for(int i = 1; i< arr.length;i++){
            rsum =tsum-lsum-arr[i];
            if(lsum == rsum) {
                System.out.println(i);
                return;
            }
            lsum+=arr[i];
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int[] testcase1 = new int[]{1, 2 ,3, 4, 2};
        int[] testcase2 = new int[]{2, 3, 10, -10, 4, 2, 9};
        method1(testcase2);
        method2(testcase2);
        method1(testcase1);
    }
}

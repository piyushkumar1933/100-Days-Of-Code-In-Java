package Day10;

public class Barchart {
    public static void printbarchart(int [] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        for(int i =1; i<=max;i++){
            for(int j = 0; j<n;j++){
                if(arr[j]+i>max)
                    System.out.print("*\t");
                else
                    System.out.print("\t");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] testcase1 = new int[]{3,2,0,7,4};
        int [] testcase2 = new int[]{3,1,0,7,5};
        printbarchart(testcase1);
        printbarchart(testcase2);
    }
}

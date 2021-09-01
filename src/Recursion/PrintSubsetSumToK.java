package Recursion;

public class PrintSubsetSumToK {
    public static void printsumtoK(int []arr,int []output,int start,int k){
        if(arr.length == start){
            if(k==0){
                for(int i = 0; i<output.length;i++){
                    System.out.print(output[i]);
                }
                System.out.println();
            }
            return;
        }
        int [] newoutput = new int [output.length+1];
        newoutput[0] = arr[start];
        for(int i = 0 ;i<output.length;i++){
            newoutput[i+1] = output[i];
        }
        printsumtoK(arr,newoutput,start+1,k-arr[start]);
        printsumtoK(arr,output,start+1,k);
    }

    public static void main(String[] args) {
        int test1[] = {5, 12, 3, 17, 1, 18, 15, 3, 17 };
        int output[] = new int[0];
        printsumtoK(test1,output,0,6);
    }
}

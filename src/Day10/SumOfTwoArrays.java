package Day10;

import utilities.Basic;

public class SumOfTwoArrays {
    public static void sumArray(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int index = n1>n2?n1:n2;
        int []  max = new int[index];
        int i = n1-1,j=n2-1;
        int carry = 0;
            while (index>0){
                int sum = carry;
            if(i>=0)
                sum+=arr1[i];
            if(j>=0)
                sum+=arr2[j];
            carry = sum/10;
            sum = sum%10;

            max[index-1] = sum;
            i--;
            j--;
            index--;

        }
        if(carry!=0)
            System.out.print(carry);
        for(int num:max){
            System.out.print(num);
        }

    }
    public static void diff(int arr1[],int arr2[]){
        int carry = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        while (j>=0){
            int sub=arr2[j]-carry;
            if(i>=0){
                sub-=arr1[i];
            }
            if(sub<0){
                sub+=10;
                carry = 1;
            }
            arr2[j] = sub;
            i--;
            j--;
        }
        Basic.printArray(arr2,arr2.length);
    }

    public static void main(String[] args) {
        int [] testcase1a = new int[]{2,3,6,4,2};
        int [] testcase1b = new int[]{3,3,3,3,3};
        sumArray(testcase1a,testcase1b);
        System.out.println();
        diff(testcase1a,testcase1b);
    }
}

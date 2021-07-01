/*
Find Unique

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 */
package Day9;
import utilities.Basic;

import java.util.Arrays;

public class Unique {
    public static int findunique1(int Arr[]){
        int unique = 0;
        int count = 0;
        Arrays.sort(Arr);
        for (int i = 1; i<Arr.length;i++){

            if(Arr[i-1]!=Arr[i]){
                if(count == 0){
                    unique = Arr[i-1];
                    break;
                }
                else
                    count = 0;

            }
            else
                count++;
        }
        if(Arr[Arr.length-2]!=Arr[Arr.length-1]){
            if(count == 0){
                unique = Arr[Arr.length-1];
            }
        }
        return unique;
    }
    public static int findunique2(int Arr[]){
        int unique = 0;
        for(int i = 0; i<Arr.length;i++){
            int count = 0;
            for (int j=0;j<Arr.length;j++){
                if(Arr[i] == Arr[j]){
                    count++;
                }
            }
            if(count==1){
                unique = Arr[i];
                return unique;
            }
        }
        return unique;
    }
// Xor of two same number is 0
// Xor of 0 with number is number
    public static int findunique(int Arr[]){
        int res = Arr[0];
        for(int i= 1; i<Arr.length;i++){
            res^=Arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int [] testcase1 = new int[]{2, 3, 1, 1, 3, 6, 6};
        int [] testcase2 = new int[]{1, 2, 2, 3, 3, 6, 6};
        System.out.println(findunique1(testcase1));
        System.out.println(findunique2(testcase1));
        System.out.println(findunique1(testcase2));
        System.out.println(findunique2(testcase2));
        System.out.println(findunique(testcase2));
       // Basic.printArray(testcase1,testcase1.length);

    }
}

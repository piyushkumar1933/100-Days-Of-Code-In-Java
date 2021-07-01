package utilities;

import java.util.*;

public class Basic {
    // Function to take one integter input from scannr class string will be printed
   public static int oneIntInput(String s){
       System.out.println(s);
       Scanner sc = new Scanner(System.in);
       return sc.nextInt();
   }
   //overloading the method if nothing is specified
   public  static int oneIntInput(){
       Scanner sc = new Scanner(System.in);
       return sc.nextInt();
   }
   // To count the no of digit
   public static int countDigit(int dig){
       int count = 0;
       while (dig !=0){
           dig = dig/10;
           count++;
       }
       return count;
   }
   public static void printArray(int A[],int n){
       for(int i = 0; i<n;i++){
           System.out.print(A[i]+"\t");
       }
   }

}

/*
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. And input string does not contain 0s.
Input format :
A numeric string
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
 */
package Recursion;

public class ReturnAllCodes {
    public static String[] reeturnCode(int n) {
        if (n == 0) {
            return new String[]{""};
        }
        String[] temp1 = reeturnCode(n / 10);
        String[] temp2 = new String[0];
        if (n > 9) {
            temp2 = reeturnCode(n / 100);
        }
        String[] output = new String[temp1.length + temp2.length];
        int index = 0;
        for (int i = 0; i < temp1.length; i++) {
            output[index++] = temp1[i] + (char) ('a' + n % 10 - 1);
        }
        for (int i = 0; i < temp2.length; i++) {
                output[index++] = temp2[i] + (char) ('a' + n % 100 - 1);

        }
        return output;
    }
    public static void printCode(String str,String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }
        printCode(str.substring(1),output+(char)('a'+Integer.parseInt(str.substring(0,1))-1));
        if(str.length()>1){
            int value = Integer.parseInt(str.substring(0,2));
            if(value>=10 && value<=26) {
                printCode(str.substring(2), output + (char) ('a' + value - 1));
            }
        }

    }
    public static void main(String[] args) {
        String []s = reeturnCode(1123);
        for(String str:s){
            System.out.println(str);
        }
printCode("1123","");
    }
}

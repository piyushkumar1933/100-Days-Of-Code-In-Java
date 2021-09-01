package Recursion;

public class PermutationOfString {
    public static void printPermutation(String str,String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }
        for(int i = 0; i<str.length();i++){
            String temp = "";
            for(int j = 0; j<str.length();j++){
                if(i == j)
                    continue;
                temp = temp+str.charAt(j);
            }
            printPermutation(temp,output+str.charAt(i));
        }
    }
    public static String[] returnPermutation(String str){
        if(str.length()==0)
            return new String[]{""};
        String smalloutput[] = returnPermutation(str.substring(1));
        String output[] = new String[smalloutput.length*str.length()];
        int index = 0;
        for(int i = 0; i<smalloutput.length;i++){
            String temp = smalloutput[i];
            for(int j = 0; j<=temp.length();j++){
                output[index++] = temp.substring(0,j)+str.charAt(0)+temp.substring(j);
            }
        }
        return output;
    }
    public static int fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static String[] returnPermutation2(String str){
        if(str.length() == 0){
            return new String[]{""};
        }
        String [] output = new String[fact(str.length())];
        int k = 0;
        for(int i = 0; i<str.length();i++){
            String [] smalloutput = returnPermutation(str.substring(0,i)+str.substring(i+1));
            for(int j = 0; j<smalloutput.length;j++){
                output[k++] = str.charAt(i)+smalloutput[j];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        printPermutation("abc","");
        String [] out = returnPermutation2("abcd");
        for(String s:out){
            System.out.println(s);
        }
    }

}

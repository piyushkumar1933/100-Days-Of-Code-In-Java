package Recursion;

public class ReturnKeypad {
    public  static String digitString(int num){
        if(num <= 1 || num>=10){
            System.exit(0);
        }
        if(num==2){
            return "abc";
        }
        else if(num==3){
            return "def";
        }
        else{
            return "ghi";
        }
    }
    public static String[] keypad(int n){
        if(n == 0){
            return new String[]{""};
        }
        String [] samll = keypad(n/10);
        String temp = digitString(n%10);
        String [] output = new String[samll.length*temp.length()];
        int k = 0;
        for(int i = 0; i<temp.length();i++){
            for(int j = 0; j<samll.length;j++){
                output[k++] = samll[j]+temp.charAt(i);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String [] ans = keypad(234);
        for(String s:ans){
            System.out.println(s);
        }
    }
}

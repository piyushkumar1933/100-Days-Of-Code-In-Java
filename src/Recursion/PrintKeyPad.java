package Recursion;

public class PrintKeyPad {
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
    public static void print(int num,String output){
        if(num == 0){
            System.out.println(output);
            return;
        }
        String options = digitString(num%10);
        for(int i = 0; i<options.length();i++){
            print(num/10,options.charAt(i)+output);
        }
    }
    public static void main(String[] args) {
        print(234,"");
    }
}

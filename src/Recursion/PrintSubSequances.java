package Recursion;

public class PrintSubSequances {
    public static void print(String str,String out){
        if(str.length()==0){
            System.out.println(out);
            return;
        }
        print(str.substring(1),out);
        print(str.substring(1),out+str.charAt(0));
    }
    public static void main(String[] args) {
        print("abcd","");
        //System.out.println("a".substring(1));
    }
}

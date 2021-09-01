package Recursion;

public class CheckAB {
    public static boolean isCheckAb(String str){
        if(str.length()==0){
            return true;
        }
        if(str.charAt(0) =='a'){
            if(str.length()>1 && str.substring(1,3).equals("bb")){
                return isCheckAb(str.substring(3));
            }
            return isCheckAb(str.substring(1));
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isCheckAb("abababa"));
        System.out.println(isCheckAb("abb"));
    }
}

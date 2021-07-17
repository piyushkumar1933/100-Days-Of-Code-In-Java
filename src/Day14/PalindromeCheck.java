package Day14;

public class PalindromeCheck {
    public static boolean ispalindrome(String s,int start,int end){
        if(start >= end){
            return true;
        }
        else if(s.charAt(start) !=s.charAt(end))
            return false;
        else
            return ispalindrome(s,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.println(ispalindrome("racecar",0,6));
        System.out.println(ispalindrome("ninza",0,4));
    }
}

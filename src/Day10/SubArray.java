package Day10;

public class SubArray {
    public static void substring(String s){
        for(int i =0; i<s.length();i++){
            for (int j = i+1; j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void subarray(char [] c){
        for(int i =0;i<c.length;i++){
            for(int j = i;j<c.length;j++){
                for (int k = i;k<=j;k++){
                    System.out.print(c[k]);
                }
                System.out.println();
            }
        }
    }
    public static boolean ispalindrome(String s){
        boolean ispalin = true;
        int start = 0;
        int end = s.length()-1;
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                ispalin = false;
                return ispalin;
            }
            start++;
            end--;

        }
        return ispalin;
    }
    public static void main(String[] args) {
        char[] testcase = new char[]{'a','b','c','d','e'};
        System.out.println(testcase);
        subarray(testcase);
        substring("abcde");
    }
}

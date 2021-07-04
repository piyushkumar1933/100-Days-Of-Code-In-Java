package Day10;

public class SubArray {
    public static void substring(String s){
        for(int i =0; i<s.length();i++){
            for (int j = i; j<=s.length();j++){
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

    public static void main(String[] args) {
        char[] testcase = new char[]{'a','b','c','d','e'};
        System.out.println(testcase);
        subarray(testcase);
        substring("abcde");
    }
}

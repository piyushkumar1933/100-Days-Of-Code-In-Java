/*
Sample Input
Always indent your code
Sample Output
code your indent Always
 */
package Day12;

public class ReverseString {
    public static String reverse(String s){
        String rev = "";
        String temp = "";
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                rev = temp+" "+ rev;
                temp = "";
            }
            else
                temp+=s.charAt(i);
        }
        rev = temp+" "+rev;
        return rev;
    }
    public static String reverse2(String s){
        int i = s.length()-1;
        int end = i;
        String rev = "";
        while (i>=0){
            if(s.charAt(i) == ' '){
                rev = rev+s.substring(i+1,end)+" ";
                end = i;
            }
            i--;
        }
        rev = rev+s.substring(i+1,end);
        return rev;
    }
    public static void reverse3(String s){
        char [] str = s.toCharArray();
        //Reverese the whole array first
        reversechar(str,0,str.length-1);
        int start = 0;
        for (int i = 0; i< str.length;i++){
            if(str[i] == ' '){
                reversechar(str,start,i-1);
                start = i+1;
            }
        }
        reversechar(str,start,str.length-1);
        System.out.println(String.valueOf(str));

    }
    public static void reversechar(char[] s, int start,int end){
        while (start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hllo i am piyush"));
        System.out.println(reverse("Always indent your code"));
        System.out.println(reverse2("Always indent your code"));
        reverse3("Always looks good");
        reverse3("Always indent your code");
    }
}

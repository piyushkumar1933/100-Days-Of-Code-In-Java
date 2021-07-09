/*
Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
 */
package Day12;

public class StringCompression {
    public static String compress(String s){
        StringBuffer sb = new StringBuffer();
        int count = 1;
        sb.append(s.charAt(0));
        for (int i = 1; i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            }
            else {
                if(count>1){
                    sb.append(count);
                }
                sb.append(s.charAt(i));
                count = 1;
            }
        }
        if(count > 1)
            sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabc"));
        System.out.println(compress("aaabbcddeeeee"));
    }
}

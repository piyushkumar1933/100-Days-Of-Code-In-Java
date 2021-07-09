/*

For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 */
package Day12;

public class RemoveConsecutiveDuplicates {
    public static void consecutivedup(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i))
                sb.append(s.charAt(i-1));
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb);
    }

    public static void main(String[] args) {
        consecutivedup("aabbccd");
        consecutivedup("aaaaaaa");
        consecutivedup("xxyyzxx");
    }
}

/*
For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
 */
package Day12;

public class HighestOccuringChar {
    public static char highestChar(String s){
        int [] freq = new int[256];
        for(int i = 0; i<s.length();i++){
            freq[(int)s.charAt(i)] +=1;
        }
        int max = 0;
        int ptr = 0;
        for(int i = 0; i<256;i++){
            if(freq[i]>max){
                max = freq[i];
                ptr = i;
            }
        }
        System.out.println(max);
        return (char)ptr ;
    }

    public static void main(String[] args) {
        System.out.println(highestChar("AAAAB"));
        System.out.println(highestChar("XY"));
        System.out.println(highestChar("abdefgbabfba"));
    }
}

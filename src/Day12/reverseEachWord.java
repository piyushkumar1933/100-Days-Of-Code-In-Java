
/*
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
 */
package Day12;


public class reverseEachWord {
    public static void reveachword(String s){
        String rev = "";
        String temp = new String("");
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                rev = rev+reverse(temp)+" ";
                temp ="";
            }
            else {
                temp=temp+s.charAt(i);
            }
        }
        rev = rev+reverse(temp)+" ";
        System.out.println(rev);
    }
    public static void reverseeachword2(String s){
        int start  = -1;
        String rev = "";
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                rev += reverse2(s,start+1,i)+" ";
                start = i;
            }
            //System.out.println(rev);
        }
        rev += reverse2(s,start+1,s.length());
        System.out.println(rev);
    }
    public static String reverse2(String s, int start,int end){
        String temp ="";
        while (start<end){
            temp = s.charAt(start)+ temp;
            start++;
        }
        return temp;
    }
    public static String reverse(String s){
        return reverse(s,0,s.length()-1);
    }
    public static String reverse(String s,int start,int end){
        char [] ch = s.toCharArray();
        while (start<=end){
            char temp = ch[start];
            ch[start]= ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        reveachword("Hllo i am piyush");
        reveachword("Always indent your code");
        reverseeachword2("Always indent your code");
    }
}

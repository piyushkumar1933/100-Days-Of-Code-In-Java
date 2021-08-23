package Day25;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    private static boolean ceck(Stack<Character> st, char c){
        if(st.isEmpty()){
            return false;
        }
        char ch = st.pop();
        if(c == ')' && ch =='(')
            return true;
        else if(c =='}' && ch == '{')
            return true;
        else if(c ==']' && ch == '[')
            return true;
        else
            return false;

    }
    public static boolean isBalanced(String exp){
        Stack<Character> st = new Stack<>();
       for(int i = 0; i<exp.length();i++){
           Character ch = exp.charAt(i);
           if(ch == '{'||ch == '('||ch=='['){
               st.push(ch);
           }
           else if(!ceck(st,ch)){
              return false;
           }
       }
       return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isBalanced(sc.nextLine()));
    }
}

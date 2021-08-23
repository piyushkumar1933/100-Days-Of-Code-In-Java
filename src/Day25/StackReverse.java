package Day25;

import java.util.Iterator;
import java.util.Stack;
public class StackReverse {
    public  static void reverse(Stack<Integer> sc, Stack<Integer> temp){
        if(sc.isEmpty()||sc.size()==1){
            return;
        }
        int x = sc.pop();
        reverse(sc,temp);
        while (!sc.isEmpty()){
            temp.push(sc.pop());
        }
        sc.push(x);

        while (!temp.isEmpty()){
            sc.push(temp.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack();
        Stack<Integer> temp = new Stack<>();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        reverse(sc,temp);
        Iterator it = sc.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

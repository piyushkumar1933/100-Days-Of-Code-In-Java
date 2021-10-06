package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static  <T> void reverse(Queue<T> q){
        Stack<T> st = new Stack<>();
        while (!q.isEmpty()){
            st.push(q.poll());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
    }
    //Reverse using recursion
    public static <T> void reverseR(Queue<T>q){
        if(q.size()<=1)
            return;
        T temp = q.poll();
        reverseR(q);
        q.add(temp);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Queue<Integer> q1 = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        //reverse(q);
        reverseR(q);
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}

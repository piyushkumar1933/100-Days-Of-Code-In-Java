package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Kreverse {
    public static  <T> void reverse(Queue<T> q,int k){
        Stack<T> s = new Stack<>();
        for (int i = 0; i<k;i++){
            s.push(q.poll());
        }
        //copies data back to queue
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i = 0; i<q.size()-k;i++){
            q.add(q.poll());
        }
    }
//    public static <T> void kreverse(Queue<T>q,int k){
//        if(k ==0)
//            return;
//        T temp = q.poll();
//        kreverse(q,k-1);
//        q.add(temp);
//    }
    // We can apply then size-k   for(int i = 0; i<q.size()-k;i++){
//            q.add(q.poll());
//        }
    public static void main(String[] args) {
        Queue<Integer> q =new  LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        reverse(q,3);
//        System.out.println(q.add(q.poll()));
//        System.out.println(q.peek());

       while (!q.isEmpty()){
           System.out.println(q.poll());
     }

    }
}

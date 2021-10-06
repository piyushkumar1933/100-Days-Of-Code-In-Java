package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();
    // Making Pop operation costier
    public int getSize(){
        return q1.size();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
//    public void push(T val){
//        q1.add(val);
//    }
//    public Object pop(){
//        if(isEmpty())
//            return -1;
//        while (q1.size()>1)
//            q2.add(q1.poll());
//        T val =  q1.poll();
////        while (!q2.isEmpty())
////            q1.add(q2.poll());
//        //Or we can swap refrences
//        Queue<T> temp = q1;
//        q1 = q2;
//        q2 = temp;
//        return val;
//    }
//    public Object peek(){
//        if(isEmpty())
//            return -1;
//        while (q1.size()>1)
//            q2.add(q1.poll());
//        T val =  q1.peek();
//        q2.add(q1.poll());
//        while (!q2.isEmpty())
//            q1.add(q2.poll());
//        return val;
//    }

    // By making push operation costier
    public void push(T val){
         while (!q1.isEmpty())
             q2.add(q1.poll());
         q1.add(val);
         while (!q2.isEmpty())
             q1.add(q2.poll());
    }
    public Object pop(){
        if(isEmpty())
            return -1;
        return q1.poll();
    }
    public Object peek(){
        if(isEmpty())
            return -1;
        return q1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue<Integer> s = new StackUsingQueue<Integer>();
        s.push(20);
        s.push(22);
        s.push(25);
        System.out.println(s.getSize());
        s.pop();
        System.out.println(s.peek());
       System.out.println(s.isEmpty());
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

}

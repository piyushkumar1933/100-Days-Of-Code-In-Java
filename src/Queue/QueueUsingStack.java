package Queue;

import java.util.Stack;

public class QueueUsingStack<T> {
    Stack<T> s1 = new Stack<>();
    Stack<T> s2 = new Stack<>();
    // By making the enqueue operation costiter
//    public int getsize(){
//        return s1.size();
//    }
//    public boolean isEmpty(){
//        return s1.isEmpty();
//    }
//    public void enqueue(T val){
//        while (!s1.isEmpty()){
//            s2.push(s1.pop());
//        }
//        s1.push(val);
//        while (!s2.isEmpty()){
//            s1.push(s2.pop());
//        }
//    }
//    public Object dequeue(){
//        if(isEmpty())
//            return -1;
//        return s1.pop();
//
//    }
//    public Object front(){
//        if(isEmpty())
//            return -1;
//        return s1.peek();
//    }
    // By making dequeue operation costier
    public int getsize(){
        return s1.size()+s2.size();
    }
    public boolean isEmpty(){
        return s1.isEmpty()&&s2.isEmpty();
   }
    public void enqueue(T val){
        s1.push(val);
    }
    public Object dequeue() {
        if (isEmpty())
            return -1;
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }
    public Object front(){
        if(isEmpty())
          return -1;
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
  }


    public static void main(String[] args) {
        QueueUsingStack<Integer> q = new QueueUsingStack<>();
        for(int i = 0; i<4;i++)
            q.enqueue(i);
        System.out.println(q.getsize());
        while (!q.isEmpty())
            System.out.println(q.dequeue());
        System.out.println(q.front());
    }
}

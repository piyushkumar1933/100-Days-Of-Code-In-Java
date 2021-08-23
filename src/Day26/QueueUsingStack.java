package Day26;

//By making Dequeue operation costly
import  java.util.Stack;
class Queue1 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enQueue(int data) {
        s1.push(data);
    }

    public int deQueue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }
}
//By making the enQueue costly
  class   Queue2{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public  void  enQueue(int x){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int deQueue(){
        if(s1.isEmpty())
            return -1;
        return s1.pop();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.enQueue(1);
        q.enQueue(2);
        System.out.println(q.deQueue());
        q.enQueue(3);
        q.enQueue(5);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}

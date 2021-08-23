package Day25;

import java.util.Stack;

class Node<T>{
    T data;
    Node next;
    Node(T data){
        this.data = data;
    }
}
public class StackUsingLL<T> {
    private Node<T>top;
    public int size(){
        int count = 0;
        Node<T> temp = top;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean isEmpty(){
        if(top == null)
            return true;
        return false;
    }
    public void push(T data){
        Node<T> ptr = new Node<>(data);
        ptr.next = top;
        top = ptr;
    }
    public T pop() throws StackEmptyException{
        if(top == null){
            throw new StackEmptyException();
        }
        T x = top.data;
        top = top.next;
        return x;
    }
    public T peek() throws StackEmptyException{
        if(top == null){
            throw new StackEmptyException();
        }
        return top.data;
    }

}
class DemoStackLL{
    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> sl = new StackUsingLL<>();
        sl.push(20);
        sl.push(30);
        sl.push(40);
        System.out.println(sl.isEmpty());
        System.out.println(sl.size());
        System.out.println(sl.peek());
        System.out.println(sl.pop());
        System.out.println(sl.pop());
        System.out.println(sl.pop());
    }
}

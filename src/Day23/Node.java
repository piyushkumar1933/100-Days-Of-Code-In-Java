package Day23;
public class Node<T>{
    Node next;
    T data;
    public Node(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
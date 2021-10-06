package Queue;
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLL<T> {
    Node<T> rear;
    Node<T> front;
    int size;
    public void enQueue(T data){
        Node<T> temp = new Node<>(data);
        size++;
        if(rear == null){
            rear = temp;
            front = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    public Object deQueue(){
        if(front == null){
            System.out.println("Queue Underflow");
            return -1; //As -1 is not compaitable so we can return the Object type
        }
        size--;
        T val = front.data;
        front = front.next;
        return val;
    }
    public void display(){
        Node<T> temp = front;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueUsingLL ql = new QueueUsingLL();
        ql.enQueue(10);
        System.out.println(ql.deQueue());
        System.out.println(ql.deQueue());
    }
}

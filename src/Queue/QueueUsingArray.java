package Queue;

public class QueueUsingArray {
    private  int [] arr;
    private  int front;
    private  int rear;
    int size;
    public QueueUsingArray(){
        arr = new int[5];
        front = -1;
        rear = -1;
    }
    public QueueUsingArray(int capacity){
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void enQueue(int data){
        if(rear == arr.length-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(rear == -1 && front == -1)
            front = 0;
        rear = rear+1;
        arr[rear] = data;
        size +=1;
    }
    public int deQueue(){
        if(front == -1 || front>rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        int deleted = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else
            front +=1;
        size--;
        return deleted;

    }
    public int front(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public void display(){
        for(int i = front;i<=rear;i++){
            System.out.printf("%d\t",arr[i]);
        }
    }

}
class QueueUse{
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        System.out.println(queue.size());
        queue.enQueue(10);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.enQueue(15);
        queue.enQueue(156);
        System.out.println(queue.deQueue());
        queue.enQueue(18);
        queue.deQueue();
        queue.display();

    }
}

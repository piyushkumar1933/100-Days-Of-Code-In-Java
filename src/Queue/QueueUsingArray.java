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
        if(rear == -1 )
            front = 0;
        rear = rear+1;
        arr[rear] = data;
        size +=1;
    }
    public int deQueue(){
        if(front == -1){
            System.out.println("Queue Underflow");
            return -1;
        }
        int deleted = arr[front++];
        size--;
        if (rear == front+1){
            front = -1;
            rear = -1;
            }
        return deleted;

    }
    public int front(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

}
class QueueUse{
    public static void main(String[] args) {

    }
}

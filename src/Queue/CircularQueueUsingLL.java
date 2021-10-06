package Queue;

public class CircularQueueUsingLL {
    private int[] data;
    private int rear;
    private int front;
    int size;
    CircularQueueUsingLL(){
        data = new int[3];
        rear = -1;
        front = -1;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void enqueue(int val){
        if(front == (rear+1)%data.length){
            System.out.println("Queue Overflow");
            return;
            //doublesize();
        }
        if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
        }
        else {
            rear = (rear+1)%data.length;
        }
        data[rear] = val;
    }
    public int dequeue(){
        if(front == -1){
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = data[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else {
            front = (front+1)%data.length;
        }
        return val;
    }
    public void display() {
        for (int i = front; i < rear&&isEmpty(); ) {
            System.out.println(data[i]);
            i = (i + 1) % data.length;
        }
        System.out.println(data[rear]);
    }
    // Function for dynamic array in queue
    private void doublesize() {
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        //We cant noramally  just copy the element
        //We have to preserve the fifo order
        // First copy the elemennt from front to last
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        //Copy from 0 to front-1
        for (int i = 0; i < front; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length-1;
    }

    public static void main(String[] args) {
        CircularQueueUsingLL cq = new CircularQueueUsingLL();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(34);
        cq.dequeue();
        cq.enqueue(30);
       cq.enqueue(66);
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(15);
        cq.display();
    }
}

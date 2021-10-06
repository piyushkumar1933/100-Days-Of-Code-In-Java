package Queue;

public class  Dequeue {
    private int [] arr;
    private int rear;
    private int front;
    private int size;
    public Dequeue(){
        arr  = new int [3];
        rear = -1;
        front = -1;
        size = 0;
    }
    public boolean isFull(){
        return (front==0 && rear == arr.length-1) || (front == rear+1);
    }
    public boolean isEmpty(){
        //return size ==0;
        return front==-1;
    }
    public void insertFront(int val) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = arr.length - 1;
        } else
            front =front-1;
        arr[front] = val;
        size++;
    }
    public void insertRear(int val){
    if(isFull()){
        System.out.println("Overflow");
        return;
    }
    if(front == -1){
        front =0;
        rear = 0;
    }
    else  if(rear == arr.length-1){
        rear = 0;
    }
    else
        rear = rear+1;
    arr[rear] = val;
    size++;
    }
    public int deleteRear(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        int val = arr[rear];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(rear == 0){
            rear = arr.length-1;
        }
        else {
            rear = rear-1;
        }
        size--;
        return val;

    }
    public int deleteFront(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        int val = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(front == arr.length-1){
            front = 0;
        }
        else {
            front = front+1;
        }
        size--;
        return val;
    }

    public static void main(String[] args) {
        Dequeue dq = new Dequeue();
        dq.insertFront(10);
//        dq.insertRear(20);
        System.out.println(dq.deleteRear());
        System.out.println(dq.deleteRear());
    }
}

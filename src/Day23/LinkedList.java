package Day23;

import java.util.Scanner;

 public class LinkedList<T> {
    private Node<T> head;
    public Node<T> getHead(){
        return head;
    }
    public void setHead(Node<T> head){
        this.head = head;
    }
    public  void atStart(T data){
        if(head == null){
            head = new Node<>(data);
        }
        else {
            Node<T> ptr = new Node<>(data);
            ptr.next = head;
            head = ptr;
        }
    }
    public void addLast(T data){
        Node<T> ptr = new Node<>(data);
        if(head == null){
            atStart(data);
            return;
        }
        Node<T> temp = head;

        while (temp.next !=null){
            temp = temp.next;
        }
        ptr.next = null;
        temp.next = ptr;
    }
    public void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
    }
    public Integer findElement(T find){
        Node<T> temp = head;
        int count = 1;
        while (temp!=null){
            if(temp.data == find)
                return count;
            count++;
            temp = temp.next;
        }
        return -1;
    }
    public Integer count(){
        Node<T> temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void appendLastN(int n){
            int startn = count()-n;
            System.out.println(count());
            Node<T> temp = head;
            if (startn<=0)
                return;
            for (int i = 0; i<startn;i++){
                addLast(temp.data);
                temp = temp.next;
            }
            head = temp;
            display();
    }
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while (n>0){
                LinkedList<Integer> L1 = new LinkedList<>();
                int temp = sc.nextInt();
                while (temp!=-1){
                    L1.addLast(temp);
                    temp = sc.nextInt();
                }
                int find = sc.nextInt();
                L1.display();
                System.out.println();
                L1.appendLastN(find);
                n--;
            }
    }

}


package LinkedList;
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList<T> {
    Node <T> head = null;
    public void add(T data){
        if(head == null)
            head = new Node<T>(data);
        else{
            Node<T> temp = head;
            while (temp.next!=null)
                temp = temp.next;
            temp.next = new Node<T>(data);
        }
    }
    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

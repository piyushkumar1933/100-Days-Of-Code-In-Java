package LinkedList;
class DoubleNode<T>{
    Node<T> head = null;
    Node<T> tail = null;
    DoubleNode(Node<T> head,Node<T> tail){
        this.head = head;
        this.tail = tail;
    }
}
public class ReverseRecursive {
    public static DoubleNode<Integer> reverse2(Node<Integer> head){
        if( head == null||head.next == null){
            return new DoubleNode<Integer>(head,head);
        }
        DoubleNode<Integer> DN = reverse2(head.next);
        DN.tail.next = head;
        head.next = null;
        return new DoubleNode<Integer>(DN.head,head);
    }
    // we can just use the head to point as tail we dont require double node class
    public static Node<Integer> reverse(Node<Integer> head){
        if( head == null||head.next == null){
            return head;
        }
        Node<Integer> temp = reverse(head.next);
        // Time O(N^2)
//        Node t = temp;
//        while (t.next!=null){
//            t = t.next;
//        }
//        t.next = head;
//        head.next = null;
        // More Efficient Approach O(N)
        head.next.next = head;
        head.next = null;
        return temp;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(4);
        ll.add(8);
        ll.add(1);
        ll.add(-5);
        ll.add(3);
        ll.add(9);
       // ll.head = reverse(ll.head);
        ll.head = reverse2(ll.head).head;
        ll.print();
    }
}

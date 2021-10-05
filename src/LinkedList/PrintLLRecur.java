package LinkedList;
public class PrintLLRecur {
    public static void printLRec(Node head){
        if(head == null)
            return;
        System.out.println(head.data);
        printLRec(head.next);
    }
    public static Node<Integer> add(Node <Integer>head,int val,int n){
        if(head==null && n>0){
            System.out.println("Cant Insert");
            return head;
        }
        if(n == 0){
                Node<Integer> temp = new Node<Integer>(val);
//                if(head == null) {
//                    head = temp;
//                    System.out.println(head.data);
//                    return head;
//                }
                temp.next = head;
                return temp;
        }
//        if(n == 1){
//            Node<Integer> temp = new Node<Integer>(val);
//            temp.next = head.next;
//            head.next = temp;
//            return head;
//        }
        Node te = add(head.next,val,n-1);
        head.next = te;
        return head;
    }
    public static Node<Integer> delete(Node<Integer> head, int pos){
        if(head == null){
            if(pos>=0){
                System.out.println("Can not Delete");
            }
            return null;
        }
        if(pos == 0){
            return head.next;
        }
        Node temp = delete(head.next,pos-1);
        head.next = temp;
        return head;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.head = add(ll.head,20,0);
         ll.head = add(ll.head,10,8);
        ll.head = delete(ll.head,3);

        printLRec(ll.head);

    }
}

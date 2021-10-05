package LinkedList;

public class BubbleSortLL {
    public static int len(Node head){
        if(head == null){
            return 0;
        }
        return 1+len(head.next);
    }
    public static Node<Integer> bubble(Node<Integer> head){
        int n = len(head);
        for(int i = 0;i<n-1;i++){
            Node<Integer> curr = head,prev = null;
            while (curr.next!=null){
                Node<Integer> fwd = curr.next;
                if(curr.data<=fwd.data){
                    prev = curr;
                    curr = curr.next;

                }
                else {
                    if(prev == null){
                        head = head.next;
                        curr.next = fwd.next;
                        fwd.next = curr;
                        prev = fwd;
                    }
                    else {
                        prev.next = fwd;
                        curr.next = fwd.next;
                        fwd.next = curr;
                        prev = fwd;
                    }
                }
            }
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(4);
        ll.add(8);
        ll.add(1);
        ll.add(-5);
        ll.add(3);
        ll.add(9);
        ll.head = bubble(ll.head);
        ll.print();
    }
}

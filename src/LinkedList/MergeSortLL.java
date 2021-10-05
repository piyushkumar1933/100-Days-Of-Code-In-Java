package LinkedList;

public class MergeSortLL {
    public static Node<Integer> mergeSort(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> fast = head,slow = head;
        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node<Integer> head2 = slow.next;
        slow.next = null; //Break the linked list
        Node<Integer> h1 = mergeSort(head);
        Node<Integer> h2 = mergeSort(head2);
        return  merge(h1,h2);
    }
    public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
        Node<Integer> c1 = head1,c2 = head2,p1 = null;
        while (c1 !=null && c2!=null){
            if(c1.data>c2.data){
                if(p1 == null){
                    Node<Integer> temp = c2;
                    c2 = c2.next;
                    head1 = temp;
                    temp.next = c1;
                    p1 = temp;
                }
                else {
                    Node<Integer> temp = c2;
                    c2 = c2.next;
                    temp.next = c1;
                    p1.next = temp;
                    p1 = temp;
                }

            }
            else {
                p1 =c1;
                c1 = c1.next;
            }
        }
        if (c1 ==null){
            p1.next = c2;
        }
        return head1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(4);
        ll.add(8);
        ll.add(1);
        ll.add(-5);
        ll.add(9);
        ll.add(3);
        ll.add(9);
        ll.head = mergeSort(ll.head);
        ll.print();
    }
}

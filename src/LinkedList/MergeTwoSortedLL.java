package LinkedList;

public class MergeTwoSortedLL {
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
    // 2nd Approach
    public static Node<Integer>merge2(Node<Integer> head1,Node<Integer> head2){
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        Node<Integer> newHead = null,newTail =null;
        Node<Integer> t1 = head1,t2 = head2;
        if(t1.data>t2.data){
            newHead = t2;
            newTail = t2;
            t2 = t2.next;

        }
        else{
            newHead = t1;
            newTail = t1;
            t1 = t1.next;
        }
        while (t1 !=null && t2!=null){
            if(t1.data>t2.data){
                newTail.next = t2;
                newTail = newTail.next;
                t2 = t2.next;
            }
            else {
                newTail.next = t1;
                newTail = newTail.next;
                t1 = t1.next;
            }
        }
        if(t1 !=null)
            newTail.next = t1;
        if(t2!=null)
            newTail.next = t2;
        return newHead;

    }
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(8);
        l1.add(12);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
       l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(12);
        l2.add(15);
        l1.head = merge(l1.head, l2.head);
        //l1.head = merge2(l1.head, l2.head);
        l1.print();
    }
}

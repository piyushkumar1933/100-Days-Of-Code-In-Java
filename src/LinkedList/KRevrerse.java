package LinkedList;

/**
 * Sample Input 1 :
 * 1
 * 1 2 3 4 5 6 7 8 9 10 -1
 * 4
 * Sample Output 1 :
 * 4 3 2 1 8 7 6 5 10 9
 * Sample Input 2 :
 * 2
 * 1 2 3 4 5 -1
 * 0
 * 10 20 30 40 -1
 * 4
 * Sample Output 2 :
 * 1 2 3 4 5
 * 40 30 20 10
 */
public class KRevrerse {
    public static Node<Integer> kreverse(Node<Integer> head,int k){
        if(k<0 || k<1){
            return head;
        }
        Node<Integer> curr = head;
        Node<Integer> fwd  = null;
        Node<Integer> prev  = null;
        int count = 0;
        //Reverse K nodes
        while (count< k && curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            count++;
        }
        if(fwd!=null)
            head.next = kreverse(fwd,k);
        return  prev;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.head = kreverse(ll.head,3);
        ll.print();

    }
}

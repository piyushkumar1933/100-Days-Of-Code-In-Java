package LinkedList;

public class SwapLL {
    public static Node<Integer> swap(Node<Integer> head,int i,int j){
        if(i<0 || i>=j)
            return head;
        Node<Integer> f = null, fprev = null;
        Node<Integer> l = null,lprev = null;
        int k = 0;
        Node head1 = head,headprev = null;
        while (head1!=null){
            if(k == i) {
                fprev = headprev;
                f = head1;
            }
            if(k == j) {
                lprev = headprev;
                l = head1;
                break;
            }
            k++;
            headprev =head1;
            head1 = head1.next;
        }
        if(head1 == null && l==null){
            System.out.println("Ivalid J");
            return head;
        }
        if(fprev != null){
            fprev.next = l;
        }
        else {
            head = l;
        }
        if(lprev!=null){
            lprev.next = f;
        }
        else{
            head = f;
        }
        //Swap both next
        Node<Integer> temp = f.next;
        f.next = l.next;
        l.next = temp;
        return head;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(70);
        ll.add(80);
        ll.add(20);
        ll.add(25);
        ll.add(78);
        ll.head = swap(ll.head,0,1);
        ll.print();
    }


}

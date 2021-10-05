package LinkedList;

public class EvenAfterOdd {
    public static void oddEven(Node head){
        if(head == null)
            return;
        Node<Integer> temp = head;
        while (temp.next!=null){
            Node<Integer> odd = temp;
            while (odd !=null){
                if(odd.data%2 !=0){
                    break;
                }
                odd = odd.next;
            }
            if(odd != temp && odd !=null){
                int x = odd.data;
                odd.data = temp.data;
                temp.data = x;
            }
            temp = temp.next;
        }
    }
    //Efficient Approach
    public static Node OddEven2(Node<Integer> head){
        Node oddH = null;
        Node oddT = null;
        Node evenT = null;
        Node evenH = null;
        while (head !=null) {
            if (head.data % 2 == 0) {
                if (evenH == null) {
                    evenH = head;
                    evenT = head;
                }
                else{
                        evenT.next = head;
                        evenT = evenT.next;
                    }
                }
            else {
                if (oddH == null) {
                    oddH = head;
                    oddT = head;
                }
                else{
                    oddT.next = head;
                    oddT = oddT.next;
                }
            }
            head = head.next;
            }
        if(oddH == null){
            evenT.next = null;
            return evenH;
        }
        oddT.next = evenH;
        if(evenT!=null)
            evenT.next = null;
        return oddH;
        }

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(3);
        ls.add(9);
       ls.add(8);
        ls.add(0);
       ls.add(4);
       ls.add(11);
       // oddEven(ls.head);
        //ls.print();
        ls.head = OddEven2(ls.head);
        System.out.println(ls);
        ls.print();
    }
}

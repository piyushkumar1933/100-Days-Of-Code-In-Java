package Day23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EliminateDuplicateLL {
    public static void rmduplicate(LinkedList ls){
        Node head = ls.getHead();
        Node ptr = head,temp = head.next;
        while (temp.next!=null){
            if(ptr.data == temp.data){
                ptr.next = temp.next;
            }
            else
                ptr = ptr.next;
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x!=-1){
            ls.addLast(x);
            x = sc.nextInt();
        }
        ls.display();
//        rmduplicate(ls);
//        HashSet hs = new HashSet();
//        Node head= ls.getHead();
//        while (head.next!=null){
//            hs.add(head.data);
//            head = head.next;
//        }
//        Iterator itr = hs.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        System.out.println();
        ls.display();
    }
}

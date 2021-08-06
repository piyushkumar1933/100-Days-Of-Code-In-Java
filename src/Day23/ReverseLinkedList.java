package Day23;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void revrse1(LinkedList ls){
        Node temp = ls.getHead();
        int n = ls.count();
        for(int i = 0; i<n;i++){
            temp = ls.getHead();
            for(int j = i+1;j<n;j++)
                temp = temp.next;
            System.out.println(temp.data);
        }
    }
    public static void reverse2(Node head){
        if(head == null)
            return;
        reverse2(head.next);
        System.out.println(head.data);
    }
    public static LinkedList reverse3(LinkedList ls){
        Node curr = ls.getHead();
        Node prev = null;
        Node fwd = null;
        while (curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        ls.setHead(prev);
        return ls;
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
        revrse1(ls);
        reverse2(ls.getHead());
        reverse3(ls).display();
    }
}
